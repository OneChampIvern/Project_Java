package com.example.demo.api.domain.user.create;

import com.example.demo.core.repository.UserRepository;
import com.example.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserCreateController {

  private final UserRepository userRepository;

  @GetMapping("/create")
  public ResponseEntity<Object> create() {
    User user = new User();
    userRepository.insert(user);
    return ResponseEntity.ok(null);
  }
}
