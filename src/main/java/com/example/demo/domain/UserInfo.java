package com.example.demo.domain;

import lombok.*;


import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity @Table(name = "user_info")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private LocalDateTime regDate;

    @Column
    private LocalDateTime modDate;

}