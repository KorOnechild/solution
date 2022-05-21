package com.sparta.week02.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 합니다.
@EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정
public abstract class Timestamped { //abstract 추상 클래스 : 직접구현 안됌 상속으로만 접근가능 (new연산자 사용불가 즉 객체 생성 안됌)

    @CreatedDate // 생성일자임을 나타냅니다.
    private LocalDateTime createdAt;    //LocalDateTime : 시간을 나타내는 자바 자료형 중 하나

    @LastModifiedDate // 마지막 수정일자임을 나타냅니다.
    private LocalDateTime modifiedAt;
}
