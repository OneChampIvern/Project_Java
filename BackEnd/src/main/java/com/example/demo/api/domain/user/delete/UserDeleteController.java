package com.example.demo.api.domain.user.delete;

import com.example.demo.api.domain.user.create.UserCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserDeleteController {
  private final UserDeleteService userDeleteService;
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<UserDeleteResponse> delete(@PathVariable Long id) {
    return ResponseEntity.ok(userDeleteService.execute(id));
  }
}
