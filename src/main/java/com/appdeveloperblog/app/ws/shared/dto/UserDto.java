package com.appdeveloperblog.app.ws.shared.dto;

/**
 * UserDto
 */
public class UserDto {

    private static final long serialVersionUID = 1232132321L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus;

}