package com.example.demo.api.domain.user.update;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserUpdateController {
  private final UserUpdateService userUpdateService;

  @PutMapping("/update")
  public ResponseEntity<UserUpdateResponse> create(@RequestBody UserUpdateRequest userUpdateRequest) {
    return ResponseEntity.ok(userUpdateService.execute(userUpdateRequest));
  }
}
