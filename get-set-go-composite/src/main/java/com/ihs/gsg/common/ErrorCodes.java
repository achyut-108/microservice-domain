package com.ihs.gsg.common;


/***
 * 
 * @author siddhartha.kumar
 *
 */
public enum ErrorCodes {

  INVALID_USER_ID("IHS_ERROR_600", "Your User Id is not Valid"),
  INVALID_PASSWORD("IHS_ERROR_601", "Your Password is not Valid"),
  INVALID_DATA("IHS_ERROR_602", "Invalid data type"),
  AUTHENTICATION_FAILED("IHS_ERROR_603","Not Authenticated");

  private final String code;
  private final String description;

  private ErrorCodes(String code, String description) {
    this.code = code;
    this.description = description;
  }

  public String getDescription() {
     return description;
  }

  public String getCode() {
     return code;
  }

  @Override
  public String toString() {
    return code + ": " + description;
  }

}