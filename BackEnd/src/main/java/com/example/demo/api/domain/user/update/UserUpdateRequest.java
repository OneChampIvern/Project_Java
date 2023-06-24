package com.example.demo.api.domain.user.update;

import com.example.demo.core.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
  private Long id;
  private String fullName;
  private String username;
  private String password;
  private String email;
  private String phone;

  public User toServiceBuilder() {
    return User.builder()
        .id(this.id)
        .fullName(this.fullName)
        .userName(this.username)
        .email(this.email)
        .userPassword(this.password)
        .phone(this.phone)
        .build();
  }
}
