package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.Administrator;
import com.sharemeeting.demo1103.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
//controller->service->mapper->*Mapper.xml;
@RestController
@RequestMapping(value = "/CRUD", method = { RequestMethod.GET, RequestMethod.POST })
public class Admincontroller {

    @Autowired
    private AdminService adminservice;

    @RequestMapping("ListAdmin")
    @ResponseBody
    public List<Administrator> ListUser(){
        return adminservice.ListAdmin();
    }
    //对数据库进行查找操作
    @RequestMapping("ListAdminByname")
    @ResponseBody
    public String ListAdminByname(String name) {
        Administrator admin= adminservice.findAdminByName(name);
        if(admin!=null) {
            return admin.getPassword();
        }
        else{
            return "null";
        }
//        return adminservice.findAdminByName(name);
    }
    //对数据库进行的删除操作
    @RequestMapping(value = "deleteAdmin", method = RequestMethod.GET)
    public String deleteAdmin(String name) {
        int result = adminservice.deleteAdmin(name);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "updateAdmin", method = RequestMethod.POST)
    public String updateAdmin(Administrator user) {
        int result = adminservice.UpdateAdmin(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "insertAdmin", method = RequestMethod.POST)
    public Administrator insertAdmin(Administrator admin)
    {
        return adminservice.insertAdmin(admin);
    }
}

