package com.jx.service.impl;

import com.jx.bean.Person;
import com.jx.dao.PersonDAO;
import com.jx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CHEN JX on 2017/10/18.
 */

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDAO personDAO;
    @Override
    public Person querById(Integer id) {
        return personDAO.querById(id);
    }
}
