package com.example.demo.api.domain.user.search;

import com.example.demo.core.entity.User;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserSearchController {

  private final UserSearchService userSearchService;

  @GetMapping("/search")
  public ResponseEntity<List<UserSearchResponse>> searchUsers() {
    return ResponseEntity.ok(userSearchService.execute(UserSearchRequest.builder().build()));
  }
}
