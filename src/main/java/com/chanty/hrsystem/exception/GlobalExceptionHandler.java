package com.chanty.hrsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleUserNotFoundException(
      UserNotFoundException exception) {
    ErrorResponse errorResponse =
        ErrorResponse.builder()
            .message(exception.getMessage())
            .status(HttpStatus.NOT_FOUND)
            .build();
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
  }

  @ExceptionHandler({ApiException.class})
  public ResponseEntity<?> handleApiException(ApiException e){
    ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), e.getStatus());
    return ResponseEntity
            .status(e.getStatus())
            .body(errorResponse);
  }
}
