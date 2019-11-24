package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.Administrator;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface AdminMapper {

    List<Administrator> findAdminByName(String name);
    public List<Administrator> ListAdmin();
    public int insertAdmin(Administrator user);
    public int deleteAdmin(String name);
    public int UpdateAdmin(Administrator user);
}