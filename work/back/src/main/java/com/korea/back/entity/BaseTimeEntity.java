package com.korea.back.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.sound.sampled.AudioFileFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

//회원가입시 유저 생성시간과 수정시간을 추가해주는 Entity
@Getter
@MappedSuperclass
@EntityListeners(AudioFileFormat.class)
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
