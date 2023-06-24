package com.example.demo.core.repository;

import com.example.demo.core.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
  public List<User> getAll();
  public String deleteById(Long id);
  public User update(User user);
  public User insert(User user);

  public List<User> find (String params);
}
