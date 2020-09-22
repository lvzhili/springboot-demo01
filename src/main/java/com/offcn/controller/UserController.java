package com.offcn.controller;

import com.offcn.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @RequestMapping("getUser")
    public String getUser(){
        UserBean userBean = new UserBean("芽衣", 18, "郑州");
        System.out.println(userBean.toString());

        return userBean.toString();
    }

    @RequestMapping("getUserList")
    public String getUserList(){
        UserBean u1 = new UserBean("芽衣", 19, "郑州");
        UserBean u2 = new UserBean("塞西莉亚", 24, "郑州");
        UserBean u3 = new UserBean("丽塔", 20, "郑州");
        UserBean u4 = new UserBean("幽兰黛尔", 16, "郑州");
        UserBean u5 = new UserBean("琪亚娜", 19, "郑州");
        List<UserBean> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        return list.toString();
    }

}
