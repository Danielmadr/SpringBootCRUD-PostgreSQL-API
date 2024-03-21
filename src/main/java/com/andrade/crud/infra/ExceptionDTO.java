package com.andrade.crud.infra;

public class ExceptionDTO {
  private String message;

  public ExceptionDTO(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "ExceptionDTO{" +
           "message='" + message + '\'' +
           '}';
  }
}
