package com.example.demo.api.domain.user.create;

import com.example.demo.core.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.OffsetDateTime;
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
public class UserCreateResponse {
  private Long id;
  private String name;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]X")
  private OffsetDateTime createdAt;

  private String createdBy;

  public static UserCreateResponse of(User service) {
    return UserCreateResponse.builder()
        .id(service.getId())
        .name(service.getUserName())
        .build();
  }
}
