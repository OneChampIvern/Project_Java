package com.example.demo.api.service;


import com.example.demo.comon.PagingResponse;


public interface SearchService<S,T, K> {

//  PagingResponse<UserSearchResponse> findAll(
//      UserSearchRequest userSearchRequest, RowBounds rowBounds);

  PagingResponse<T> execute(S request, K rowBounds);

}
