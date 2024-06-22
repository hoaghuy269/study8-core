package com.study8.core.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * CoreDto
 * @Date: 2024-06-11
 * @Author: HuyNH
 * @Desc: Common dto
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class CoreDto {
    private LocalDateTime createdDate;
    private Long createdId;
    private Integer deleted;
    private LocalDateTime deletedDate;
    private Long deletedId;
}