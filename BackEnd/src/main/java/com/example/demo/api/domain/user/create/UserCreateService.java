package com.example.demo.api.domain.user.create;

import com.example.demo.api.service.CreateService;
import com.example.demo.core.entity.User;
import com.example.demo.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserCreateService implements
    CreateService<UserCreateRequest, UserCreateResponse> {
  private final UserRepository serviceRepository;
  @Override
  public UserCreateResponse execute(UserCreateRequest request) {
    User user = request.toServiceBuilder();
    serviceRepository.insert(user);
    return UserCreateResponse.of(user);
  }
}
