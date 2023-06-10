package com.example.demo.api.domain.service;

import com.example.demo.api.service.CreateService;
import com.example.demo.core.entity.Service;
import com.example.demo.core.repository.ServiceRepository;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class ServiceCreateService implements
    CreateService<ServiceCreateRequest, ServiceCreateResponse> {
  private final ServiceRepository serviceRepository;
  @Override
  public ServiceCreateResponse execute(ServiceCreateRequest request) {
    Service service =
        request.toServiceBuilder().createdAt(OffsetDateTime.now()).createdBy("test").build();
    serviceRepository.create(service);
    return ServiceCreateResponse.of(service);
  }
}
