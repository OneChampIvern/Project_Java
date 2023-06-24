package com.example.demo.api.service;

public interface CreateService<S,T> {
  T execute(S request);
}
