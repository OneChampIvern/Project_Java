package com.example.demo.api.domain.user.search;

import com.example.demo.api.service.SearchService;
import com.example.demo.comon.PagingResponse;
import com.example.demo.core.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserSearchService implements SearchService<UserSearchRequest, UserSearchResponse, RowBounds> {
  private final UserRepository userRepository;
  @Override
  public PagingResponse<UserSearchResponse> execute(
      UserSearchRequest userSearchRequest, RowBounds rowBounds) {
    List<UserSearchResponse> ListUser = userRepository.findAll(userSearchRequest.getSearch(), rowBounds).stream().map(UserSearchResponse::of).toList();
    Long totalElements = userRepository.countFindAll(userSearchRequest.getSearch());
    return new PagingResponse<>(ListUser, rowBounds, totalElements);
  }

//  @Override
//  public List<UserSearchResponse> execute(UserSearchRequest request) {
//    return null;
//  }
}
