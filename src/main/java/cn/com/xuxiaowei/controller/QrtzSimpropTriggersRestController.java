/*
 * Copyright 2021 the original author or authors.
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
package cn.com.xuxiaowei.controller;

import cn.com.xuxiaowei.entity.QrtzSimpropTriggers;
import cn.com.xuxiaowei.mapper.QrtzSimpropTriggersMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@RestController
@RequestMapping("/qrtz-simprop-triggers")
public class QrtzSimpropTriggersRestController extends MapperRestControllerImpl<QrtzSimpropTriggersMapper, QrtzSimpropTriggers> {

    /**
     * 分页查询
     *
     * @param request  请求
     * @param response 响应
     * @param current  当前页，默认 1
     * @param size     每页显示条数，默认 10
     * @return 返回 分页查询结果
     */
    @Override
    @RequestMapping("/page")
    public Map<String, Object> page(HttpServletRequest request, HttpServletResponse response, Long current, Long size) {
        return super.page(request, response, current, size);
    }

}

