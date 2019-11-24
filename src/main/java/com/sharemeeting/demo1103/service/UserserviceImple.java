//package com.sharemeeting.demo1103.service;
//
//import java.util.List;
//
//import com.sharemeeting.demo1103.beans.MeetingRoom;
//import  com.sharemeeting.demo1103.beans.User;
//import com.sharemeeting.demo1103.mapper.UserMapper;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserserviceImple implements Userservice{
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public List<User> getUser() throws Exception {
//        return userMapper.getUser();
//    }
//
//    @Override
//    public void deleteUser(String name) throws Exception {
//        userMapper.deleteUser(name);
//    }
//
//    @Override
//    public void addUser(User user) throws Exception {
//        userMapper.addUser(user);
//    }
//
//    @Override
//    public List<MeetingRoom> getEmptyMeetingRoom()throws Exception{
//        return userMapper.getEmpty_MeetingRoom();
//    }
//}
