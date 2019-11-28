package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface UserMapper {
    //获取用户名单
//    @Select("select * from User")
//    List<User> getUser() throws Exception;
//    //获取空闲教室名单
//    @Select("select * from MeetingRoom")
//    List<MeetingRoom> getEmpty_MeetingRoom() throws Exception;
//    //根据id删除用户
//    @Delete("delete from User where name = #{name}")
//    void deleteUser(String name)throws Exception;
//    //新增用户
//    @Insert("insert into users(name,password)values(#{name},#{password})")
//    void addUser(User user)throws Exception;
//
//    //修改用户信息；
//    @Update("update users set password = #{password} where name = #{name}")
    User findUserByName(String name);
    public List<User> ListUser();
    public void insertUser(User user);
    public int delete(String name);
    public int Update(User user);
}
