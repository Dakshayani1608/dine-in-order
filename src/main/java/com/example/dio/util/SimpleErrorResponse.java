package com.example.dio.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class SimpleErrorResponse {
    private String type;
    private int status;
    private String message;
}
