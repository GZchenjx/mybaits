package com.jx.service;

import com.jx.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by CHEN JX on 2017/10/17.
 */
public interface UserService {

    User queryById(Integer id);
}
