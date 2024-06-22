package com.study8.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * CoreEntity
 * @Date: 2024-04-13
 * @Author: HuyNH
 * @Desc: Common sql column
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class CoreEntity {
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "created_id")
    private Long createdId;

    @Column(name = "deleted")
    private Integer deleted;

    @Column(name = "deleted_date")
    private LocalDateTime deletedDate;

    @Column(name = "deleted_id")
    private Long deletedId;
}