package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.Administrator;
import com.sharemeeting.demo1103.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Administrator findAdminByName(String name) {
        return adminMapper.findAdminByName(name);
    }
    public Administrator insertAdmin(Administrator admin) { adminMapper.insertAdmin(admin);return admin;}
    public List<Administrator> ListAdmin(){
        return  adminMapper.ListAdmin();
    }
    public int UpdateAdmin(Administrator admin){
        return adminMapper.UpdateAdmin(admin);
    }
    public int deleteAdmin(String name){
        return adminMapper.deleteAdmin(name);
    }

}
