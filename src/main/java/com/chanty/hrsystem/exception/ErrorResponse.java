package com.chanty.house.cleaning.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
public class ErrorResponse {
  private String message;
  private HttpStatus status;
}
