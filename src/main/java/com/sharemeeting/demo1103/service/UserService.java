package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.User;
import com.sharemeeting.demo1103.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//public interface Userservice {
//    public List<User> getUser() throws Exception;
////    public void deleteUser(String name) throws Exception;
////    public void addUser(User user)throws Exception;
////    public List<MeetingRoom> getEmptyMeetingRoom()throws Exception;
//}

public class UserService{

    @Autowired
    private UserMapper userMapper;
    public User findByName(String name) {
        return userMapper.findUserByName(name);
    }
    public void insertUser(User user) { userMapper.insertUser(user);}//return user;}
    public List<User> ListUser(){
        return  userMapper.ListUser();
    }
    public int Update(User user){
        return userMapper.Update(user);
    }
    public int delete(String name){
        return userMapper.delete(name);
    }

}
