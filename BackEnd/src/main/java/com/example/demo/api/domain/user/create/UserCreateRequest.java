package com.example.demo.api.domain.user.create;

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
public class UserCreateRequest {
  private String fullName;
  private String userName;
  private String password;
  private String email;
  private String phone;

  public User toServiceBuilder() {
    return User.builder()
        .fullName(this.fullName)
        .userName(this.userName)
        .email(this.email)
        .userPassword(this.password)
        .phone(this.phone)
        .build();
  }
}
