package com.example.demo.api.domain.user.create;

import com.example.demo.api.service.CreateService;
import com.example.demo.core.entity.User;
import com.example.demo.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
@Slf4j
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserCreateService implements
    CreateService<UserCreateRequest, UserCreateResponse> {
  @Autowired
  private final UserRepository serviceRepository;
  @Override
  public UserCreateResponse execute(UserCreateRequest request) {
    User user = request.toServiceBuilder();
    try{
      serviceRepository.insert(user);
    } catch (Exception ex) {
      log.error("error: {}", ex.getMessage(), ex);
    }

    return UserCreateResponse.of(user);
  }
}
