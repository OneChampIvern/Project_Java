package com.example.demo.api.domain.user.update;

import com.example.demo.api.service.CreateService;
import com.example.demo.core.entity.User;
import com.example.demo.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserUpdateService implements CreateService<UserUpdateRequest, UserUpdateResponse> {
  private final UserRepository userRepository;

  @Override
  public UserUpdateResponse execute(UserUpdateRequest userUpdateRequest) {
    User user = userUpdateRequest.toServiceBuilder();
    UserUpdateResponse userResponse = UserUpdateResponse.of(user);
    userRepository.update(user);
    return userResponse;
  }
}
