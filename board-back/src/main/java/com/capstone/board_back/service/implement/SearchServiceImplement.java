package com.capstone.board_back.service.implement;

import com.capstone.board_back.dto.response.ResponseDto;
import com.capstone.board_back.dto.response.board.GetTop3BoardListResponseDto;
import com.capstone.board_back.dto.response.search.GetPopularListResponseDto;
import com.capstone.board_back.repository.SearchLogRepository;
import com.capstone.board_back.repository.resultSet.GetPopularListResultSet;
import com.capstone.board_back.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImplement implements SearchService {

    private final SearchLogRepository searchLogRepository;

    @Override
    public ResponseEntity<? super GetPopularListResponseDto> getPopularList() {

        List<GetPopularListResultSet> resultSets = new ArrayList<>();

        try {

            resultSets = searchLogRepository.getPopularList();

        } catch (Exception exception) {
           exception.printStackTrace();
           return ResponseDto.databaseError();
        }

        return GetPopularListResponseDto.success(resultSets);
    }
}
