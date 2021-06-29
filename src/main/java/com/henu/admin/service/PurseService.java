package com.henu.admin.service;

import com.henu.admin.bean.Purse;
import com.henu.admin.mappper.PurseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurseService {
    @Autowired
    PurseMapper purseMapper;

    public Purse getAccountById(Long id){
        return purseMapper.getPurse(id);
    }

}
