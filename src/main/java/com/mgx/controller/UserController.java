package com.mgx.controller;

import com.mgx.pojo.User;
import com.mgx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mgx on 17/8/29.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        return "showUser";
    }
}
