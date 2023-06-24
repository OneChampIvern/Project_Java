package com.example.demo.api.domain.user.update;

import com.example.demo.core.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateResponse {
  private Long id;
  private String fullName;
  private String userName;
  private String password;
  private String email;
  private String phone;
  public static UserUpdateResponse of(User user) {
    return UserUpdateResponse.builder()
        .id(user.getId())
        .fullName(user.getFullName())
        .userName(user.getUserName())
        .password(user.getUserPassword())
        .email(user.getEmail())
        .phone(user.getPhone())
        .build();
  }
}
