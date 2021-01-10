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
package cn.com.xuxiaowei.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static cn.com.xuxiaowei.enums.CodeList.OK;
import static cn.com.xuxiaowei.util.Constants.*;

/**
 * Mapper RestController
 * <p>
 * Mapper 接口对应的 Controller 父类，Controller 和 RestController 直接继承，
 * 继承后即可获得 新增、修改、删除、批量删除等接口
 *
 * @param <M> mapper 对象
 * @param <T> 实体类
 * @author xuxiaowei
 */
@Slf4j
public class MapperRestControllerImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IService<T> {

    /**
     * 分页查询
     *
     * @param request  请求
     * @param response 响应
     * @param current  当前页，默认 1
     * @param size     每页显示条数，默认 10
     * @return 返回 分页查询结果
     */
    public Map<String, Object> page(HttpServletRequest request, HttpServletResponse response, Long current, Long size) {
        Map<String, Object> map = new HashMap<>(4);
        Map<String, Object> data = new HashMap<>(4);
        map.put(DATA, data);

        Page<T> page = page(new Page<>(current == null ? 1 : current, size == null ? 10 : size));

        data.put("page", page);

        map.put(CODE, OK.code);
        map.put(MSG, "查询成功");

        return map;
    }

}
