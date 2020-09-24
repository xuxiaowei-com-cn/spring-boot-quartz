/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.xuxiaowei.aspect;

import cn.com.xuxiaowei.util.RequestUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * {@link Controller} AOP
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Aspect
@Component
public class ControllerAspect {

    private HttpServletRequest request;

    @Autowired
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Pointcut("execution(* cn.com.xuxiaowei.controller.*.*(..))")
    public void pointcut() {

    }

    /**
     * 前置通知
     */
    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        log.info("前置通知：");

        String requestUrl = request.getRequestURL().toString();
        log.info("请求 URL 为：{}", requestUrl);

        log.info("请求 参数 为：{}", RequestUtils.keyValue(request));

        try {
            log.info("请求 流 为：{}", RequestUtils.getInputStream(request));
        } catch (IOException e) {
            log.error("获取请求 流 异常：");
            log.error(e.getMessage(), e);
        }

    }

    /**
     * 后置通知
     */
    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint joinPoint) {
        log.info("后置通知：");

        String requestUrl = request.getRequestURL().toString();
        log.info("已执行完 URL 为：{}", requestUrl);
    }

    /**
     * 异常通知
     */
    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        log.error("异常通知：");

        String requestUrl = request.getRequestURL().toString();
        log.error("异常 URL 为：{}", requestUrl);

        log.error("异常 参数 为：{}", RequestUtils.keyValue(request));

        log.error("异常 消息 为：{}", e.getMessage(), e);
    }

}
