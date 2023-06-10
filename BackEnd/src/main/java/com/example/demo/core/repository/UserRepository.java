package com.example.demo.core.repository;

import com.example.demo.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
  public List<User> getAll();
  public void deleteById(int id);
  public User update(User user);
  public User insert(User user);
}
