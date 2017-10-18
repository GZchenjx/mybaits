package com.jx.dao;

import com.jx.bean.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by CHEN JX on 2017/10/18.
 */
@Repository
public interface PersonDAO {

    Person querById(@Param("id") Integer id);
}
