package com.example.demo.dto;

import com.example.demo.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {
    private Long id;

    @NotEmpty(message = "이름을 입력해 주세요.")
    @Size(max = 255, message = "최대 255자를 넘을 수 없습니다.")
    private String name;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
