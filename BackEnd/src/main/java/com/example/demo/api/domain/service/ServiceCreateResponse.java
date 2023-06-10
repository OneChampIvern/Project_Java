package com.example.demo.api.domain.service;

import com.example.demo.core.entity.Service;
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
public class ServiceCreateResponse {
  private Long id;
  private String name;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]X")
  private OffsetDateTime createdAt;

  private String createdBy;

  public static ServiceCreateResponse of(Service service) {
    return ServiceCreateResponse.builder()
        .id(service.getId())
        .name(service.getName())
        .createdBy(service.getCreatedBy())
        .createdAt(service.getCreatedAt())
        .build();
  }
}
