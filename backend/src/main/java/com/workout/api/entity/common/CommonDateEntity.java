package com.workout.api.entity.common;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class CommonDateEntity { // 날짜 필드 상속 처리
    // 생성 날짜
    @CreatedDate
    private LocalDateTime createdAt;

    // 최근 수정 날짜
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}