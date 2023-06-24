package com.example.demo.api.domain.user.search;

import com.example.demo.api.service.SearchService;
import com.example.demo.core.entity.User;
import com.example.demo.core.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserSearchService implements SearchService<UserSearchRequest, UserSearchResponse> {
  private final UserRepository userRepository;
  @Override
  public List<UserSearchResponse> execute(UserSearchRequest userSearchRequest) {
    List<User> listUser = userRepository.find(userSearchRequest.getName());
    return listUser.stream().map(UserSearchResponse::of).toList();
  }
}
