package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.ShareTime;
import com.sharemeeting.demo1103.mapper.ShareTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareTimeService {

    @Autowired
    private ShareTimeMapper sharetimeMapper;

    public void insertST(ShareTime sharetime) { sharetimeMapper.insertST(sharetime);}//return user;}
    public int deleteST(int ID){
        return sharetimeMapper.deleteST(ID);
    }
    public int UpdateST(ShareTime sharetime){
        return sharetimeMapper.UpdateST(sharetime);
    }
    public List<ShareTime> ListST(){
        return  sharetimeMapper.ListShareTime();
    }


}
