package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.NameList;
import com.sharemeeting.demo1103.mapper.NameListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameListService {
    @Autowired
    private NameListMapper nameListMapper;

    public List<NameList> getNameList(){ return nameListMapper.getNameList();}
    public int saveNameList(NameList nameList) { return nameListMapper.saveNameList(nameList);}
    public int deleteNameList(Integer ID) { return nameListMapper.deleteNameList(ID);}
    public NameList findByID(Integer ID) {return nameListMapper.findByID(ID);}
    public List<NameList> findByDpt(String department) { return nameListMapper.findByDpt(department);}
}
