package com.personal.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ResponseVO<T> {
    private String statusCode;
    private String message;
    private T result;

}