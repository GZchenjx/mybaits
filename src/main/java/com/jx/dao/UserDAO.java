package com.jx.dao;

import com.jx.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CHEN JX on 2017/10/18.
 */
@Repository
public interface UserDAO {

    User queryById(@Param("id") Integer id);
}
