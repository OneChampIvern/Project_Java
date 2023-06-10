package com.example.demo.core.repository;

import com.example.demo.core.entity.Service;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceRepository {
  Long create(Service service);

  List<Service> getAll();
}
