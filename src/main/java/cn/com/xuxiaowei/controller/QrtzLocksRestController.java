package cn.com.xuxiaowei.controller;


import cn.com.xuxiaowei.entity.QrtzLocks;
import cn.com.xuxiaowei.service.IQrtzLocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
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
     * @return 返回 数据
     */
    @RequestMapping("/list")
    public Map<String, Object> list(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>(4);
        Map<String, Object> data = new HashMap<>(4);

        map.put(DATA, data);

        List<QrtzLocks> qrtzLocksList = iQrtzLocksService.list();
        data.put("qrtzLocksList", qrtzLocksList);

        map.put(CODE, CODE_OK);
        map.put(MSG, "请求成功");

        return map;
    }

}

