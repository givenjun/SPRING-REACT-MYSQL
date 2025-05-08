package com.capstone.board_back.dto.response.board;

import com.capstone.board_back.dto.response.ResponseDto;
import lombok.Getter;

@Getter
public class GetBoardResponseDto extends ResponseDto {

    private int boardNumber;
    private String title;
    private String content;
    

}
