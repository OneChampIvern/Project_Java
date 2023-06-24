package com.example.demo.api.domain.user.search;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.demo.core.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSearchResponse {
  private Long id;
  private String fullName;
  private String userName;
  private String password;
  private String email;
  private String phone;


  public static UserSearchResponse of(User user) {
    return UserSearchResponse.builder()
        .id(user.getId())
        .fullName(user.getFullName())
        .userName(user.getUserName())
        .password(user.getUserPassword())
        .phone(user.getPhone())
        .email(user.getEmail())
        .build();
  }
}
