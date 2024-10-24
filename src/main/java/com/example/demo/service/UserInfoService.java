package com.example.demo.service;

import com.example.demo.domain.Status;
import com.example.demo.domain.UserInfo;
import com.example.demo.dto.UserInfoDto;
import com.example.demo.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    /**
     * UserInfo 정보 조회
     *
     * @param id
     * @return
     */
    @Transactional(readOnly = true)
    public UserInfo getSearchUserID(Long id) {
        UserInfo userInfo = userInfoRepository.getOne(id);
		
        return userInfo;
    }

    /**
     * 새 UserInfo 추가
     *
     * @param todoItemDto
     * @return
     */
    @Transactional
    public Long addUserInfo(UserInfoDto userInfoDto) {
        UserInfo userInfo = userInfoRepository.save(UserInfo.builder()
                .name(userInfoDto.getName())
                .regDate(LocalDateTime.now())
                .build());
        return userInfo.getId();
    }

}
