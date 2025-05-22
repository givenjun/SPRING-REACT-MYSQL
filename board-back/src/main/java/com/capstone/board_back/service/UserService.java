package com.capstone.board_back.service;

import com.capstone.board_back.dto.response.user.GetSignInUserResponseDto;
import com.capstone.board_back.dto.response.user.GetUserResponseDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<? super GetUserResponseDto> getUser(String email);
    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);

}
