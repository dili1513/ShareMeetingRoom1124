package com.sharemeeting.demo1103.controller;


import com.sharemeeting.demo1103.beans.Meeting;
import com.sharemeeting.demo1103.beans.User;
import com.sharemeeting.demo1103.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/CRUD", method = { RequestMethod.GET, RequestMethod.POST })
public class Usercontroller {

    @Autowired
    private UserService userservice;

    @RequestMapping("ListUser")
    @ResponseBody
    public List<User> ListUser(){
        return userservice.ListUser();
    }
    //对数据库进行查找操作
    @RequestMapping("ListUserByname")
    @ResponseBody
    public String ListUserByName(String name){
        User user=userservice.findByName(name);
        if(user!=null){
            return user.getPassword();
        }
        else{
            return "null";
        }

//        String userpwd="";
//        Iterator<User> it = Users.iterator();
    }
//    public List<User> ListUserByname(String name) {
//        return userservice.findByName(name);
//    }//返回空的情况；
    //对数据库进行的删除操作
    @RequestMapping(value = "deleteUser", method = RequestMethod.GET)
    public String delete(String name) {
        int result = userservice.delete(name);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    public String update(User user) {
        int result = userservice.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "insertUser", method = RequestMethod.POST)
    public String insert(User user)
    {
        userservice.insertUser(user);
        return "插入成功";
    }
}

//@RestController
//public class Usercontroller {
//    @Autowired
//    private Userservice userservice;
//
//    @Autowired
//    private User user;
//
//    //显示用户；
//    @RequestMapping("list")
//    public List<User> index() throws Exception{
//        return userservice.getUser();
//    }
//    @RequestMapping("MeetingRoom")
//    public List<MeetingRoom> getEmptyMeetingRoom()throws Exception{
//        return userservice.getEmptyMeetingRoom();
//    }
//    //删除用户；
//    @RequestMapping("delete/{name}")
//    public String deleteUser(@PathVariable String name)throws Exception{
//        userservice.deleteUser(name);
//        return "您已经删掉了账号为"+name+"的用户";
//    }
//    @RequestMapping(method= {RequestMethod.POST,RequestMethod.PUT},value="test")
//    public String connect()throws Exception{
//        //userservice.deleteUser(test);
//        return "连接成功";
//    }
//    //增加用户；
//    @RequestMapping("addUser")
//    public String addUser() throws Exception{
//        user.setName("user1105");
//        user.setPassword("user1");
//        userservice.addUser(user);
//        return "增加用户";
//    }
//}
