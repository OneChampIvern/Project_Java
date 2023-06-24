package com.example.demo.api.service;

import com.example.demo.api.domain.user.search.UserSearchResponse;
import java.util.List;

public interface SearchService<S,T> {
  List<T> execute(S request);

}
