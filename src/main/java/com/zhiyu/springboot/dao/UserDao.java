package com.zhiyu.springboot.dao;
import com.zhiyu.springboot.entity.User;
import java.util.List;

public interface UserDao {
    List<User> findAllUsers();
    int insertUser(User User);
    int updateUser(User User);
    int deleteUser(Integer id);
}
