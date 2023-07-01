package com.example.demo.api.domain.user.search;

import com.example.demo.comon.PagingResponse;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserSearchController {

  private final UserSearchService userSearchService;

  @GetMapping(value = "/search")
  public ResponseEntity<PagingResponse<UserSearchResponse>> searchUsers(@RequestParam(defaultValue = "") String key,
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "20") int size) {
    UserSearchRequest obj = new UserSearchRequest();
    obj.setSearch(key);
    RowBounds rowBounds = new RowBounds(page * size, size);
    return ResponseEntity.ok(userSearchService.execute(obj,rowBounds));
  }
}
