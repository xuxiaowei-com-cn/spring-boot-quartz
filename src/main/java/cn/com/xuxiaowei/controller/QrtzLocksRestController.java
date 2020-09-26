package cn.com.xuxiaowei.controller;


import cn.com.xuxiaowei.entity.QrtzLocks;
import cn.com.xuxiaowei.service.IQrtzLocksService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static cn.com.xuxiaowei.util.Constants.*;

/**
 * <p>
 * 定时器锁 前端控制器
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@RestController
@RequestMapping("/qrtz-locks")
public class QrtzLocksRestController {

    private IQrtzLocksService iQrtzLocksService;

    @Autowired
    public void setiQrtzLocksService(IQrtzLocksService iQrtzLocksService) {
        this.iQrtzLocksService = iQrtzLocksService;
    }

    /**
     * 定时器锁 所有数据
     *
     * @param request  请求
     * @param response 响应
     * @param current  当前页，默认 1
     * @param size     每页显示条数，默认 10
     * @return 返回 数据
     */
    @RequestMapping("/list")
    public Map<String, Object> list(HttpServletRequest request, HttpServletResponse response, Long current, Long size) {
        Map<String, Object> map = new HashMap<>(4);
        Map<String, Object> data = new HashMap<>(4);

        map.put(DATA, data);

        Page<QrtzLocks> qrtzLocksPage = iQrtzLocksService.page(new Page<>(current == null ? 1 : current, size == null ? 10 : size));
        data.put("qrtzLocksPage", qrtzLocksPage);

        map.put(CODE, CODE_OK);
        map.put(MSG, "请求成功");

        return map;
    }

}

