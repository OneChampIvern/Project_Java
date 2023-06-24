package com.example.demo.api.domain.user.delete;

import com.example.demo.api.service.CreateService;
import com.example.demo.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserDeleteService implements CreateService<Long, UserDeleteResponse> {
  private final UserRepository userRepository;

  @Override
  public UserDeleteResponse execute(Long id) {
    String i = userRepository.deleteById(id);
    return UserDeleteResponse.builder().result(i).build();
  }
}
