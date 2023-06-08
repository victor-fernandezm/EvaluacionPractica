package com.softtek.practicae02back.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ExceptionResponse {
    @JsonProperty
    private LocalDateTime date;
    @JsonProperty
    private String message;
    @JsonProperty
    private String description;
}

