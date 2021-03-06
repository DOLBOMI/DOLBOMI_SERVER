package com.example.dolbomi.admin.controller.dto;

import lombok.Builder;
import lombok.Getter;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.NotNull;

@Getter
public class RegisterRequestDto {

    @NotNull(message = "노인 등록번호를 입력해주세요")

    private Integer registerNo;

    @Builder
    public RegisterRequestDto(@JsonProperty("registerNo") Integer registerNo) {
        this.registerNo = registerNo;
    }

    @Builder
    public RegisterRequestDto() {

    }
}
