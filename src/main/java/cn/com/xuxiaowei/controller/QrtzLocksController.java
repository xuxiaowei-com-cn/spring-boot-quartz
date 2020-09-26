package cn.com.xuxiaowei.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 定时器锁 前端控制器
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Controller
@RequestMapping("/qrtz-locks")
public class QrtzLocksController {

    /**
     * 定时器锁 主页
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面数据
     * @return 页面位置
     */
    @RequestMapping("")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {

        return "qrtz-locks";
    }

}

