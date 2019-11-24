package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.ShareTime;
import com.sharemeeting.demo1103.service.ShareTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ShareTime", method = { RequestMethod.GET, RequestMethod.POST })
public class ShareTimecontroller {
    @Autowired
    private ShareTimeService sharetimeservice;

    @RequestMapping(value = "ListShareTime")
    @ResponseBody
    public List<ShareTime> ListST(){
        return sharetimeservice.ListST();
    }
    //对数据库进行的删除操作
    @RequestMapping(value = "deleteShareTime", method = RequestMethod.GET)
    public String deleteST(int ID) {
        int result = sharetimeservice.deleteST(ID);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "updateShareTime", method = RequestMethod.POST)
    public String update(ShareTime sharetime) {
        int result = sharetimeservice.UpdateST(sharetime);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "insertShareTime", method = RequestMethod.POST)
    public String insert(ShareTime sharetime)
    {
        sharetimeservice.insertST(sharetime);
        return "插入成功";
    }

}
