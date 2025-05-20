package com.capstone.board_back.service;

import com.capstone.board_back.dto.response.search.GetPopularListResponseDto;
import org.springframework.http.ResponseEntity;

public interface SearchService {

    ResponseEntity<? super GetPopularListResponseDto> getPopularList();

}
