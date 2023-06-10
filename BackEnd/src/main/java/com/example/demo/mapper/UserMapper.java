package com.example.demo.mapper;

import com.example.demo.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* generated
* @table dbuser.user
* @entity com.example.demo.model.User
*/
@Mapper
public interface UserMapper {

  public List<User> getAll();
  public void deleteById(int id);
}