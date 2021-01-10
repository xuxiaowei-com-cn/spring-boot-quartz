package cn.com.xuxiaowei.controller;

import cn.com.xuxiaowei.entity.QrtzCronTriggers;
import cn.com.xuxiaowei.mapper.QrtzCronTriggersMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * <p>
 * cron 触发器表 前端控制器
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-26
 */
@RestController
@RequestMapping("/qrtz-cron-triggers")
public class QrtzCronTriggersRestController extends MapperRestControllerImpl<QrtzCronTriggersMapper, QrtzCronTriggers> {

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

