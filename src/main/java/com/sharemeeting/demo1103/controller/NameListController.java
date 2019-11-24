package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.NameList;
import com.sharemeeting.demo1103.service.NameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/nameList", method = { RequestMethod.GET, RequestMethod.POST })
public class NameListController {
    @Autowired
    private NameListService nameListService;

    //查询所有名单
    @RequestMapping("getNameList")
    @ResponseBody
    public String getNameList() {
        List<NameList> nameLists = nameListService.getNameList();
        String str = "";
        Iterator<NameList> it = nameLists.iterator();
        while (it.hasNext()) {
            NameList people = it.next();
            str += people.getID() +";" +people.getName() + "|";
        }
        str = str.substring(0,str.length()-1);
        return str;
    }

    //根据ID查询人员
    @RequestMapping("findByID")
    @ResponseBody
    public String findByID(Integer ID) {
        return nameListService.findByID(ID).getName();
    }

    //根据部门查询
    @RequestMapping("findByDpt")
    @ResponseBody
    public String findByID(String department) {
        List<NameList> nameLists = nameListService.findByDpt(department);
        String str = "";
        Iterator<NameList> it = nameLists.iterator();
        while (it.hasNext()) {
            NameList people = it.next();
            str += people.getID() +";" +people.getName() + "|";
        }
        str = str.substring(0,str.length()-1);
        return str;
    }

    //根据ID删除人员
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(Integer ID) {
        int result = nameListService.deleteNameList(ID);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //添加
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(NameList nameList)
    {
        int result = nameListService.saveNameList(nameList);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }
}
