package com.example.demo.core.repository;

import com.example.demo.core.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
@Mapper
public interface UserRepository {
  public List<User> getAll();
  public String deleteById(Long id);
  public User update(User user);
  public User insert(User user);

  public List<User> findAll (String params, RowBounds rowBounds);
  public Long countFindAll(String search);
}
