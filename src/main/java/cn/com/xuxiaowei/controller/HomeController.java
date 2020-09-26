package cn.com.xuxiaowei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 首页
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Controller
@RequestMapping("/home")
public class HomeController {

    /**
     * 首页
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面数据
     * @return 页面位置
     */
    @RequestMapping("")
    public String home(HttpServletRequest request, HttpServletResponse response, Model model) {

        return "home";
    }

}
