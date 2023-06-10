package com.example.demo.api.domain.service;

import com.example.demo.core.entity.Service;
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
public class ServiceCreateRequest {
  private String name;

  public Service.ServiceBuilder toServiceBuilder() {
    return Service.builder().name(this.name);
  }
}
