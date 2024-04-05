package com.software.censo.service;

import com.software.censo.model.CensoUser;
import com.software.censo.repository.CensoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CensoUserService {

    @Autowired
    private CensoUserRepository repository;

    public CensoUser saveCensoUser(CensoUser user) {
        //TODO: implement password decoder
        return repository.save(user);
    }

    public List<CensoUser> getAllCensoUsers() {
        return repository.findAll();
    }
}
