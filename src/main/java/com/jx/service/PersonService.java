package com.jx.service;

import com.jx.bean.Person;
import org.apache.ibatis.annotations.Param;

/**
 * Created by CHEN JX on 2017/10/18.
 */
public interface PersonService {

    Person querById( Integer id);
}
