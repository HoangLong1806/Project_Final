/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package org.example.projectfinal.request.user;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   10/04/2024
 *vesion: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignupRequest {
    @NotBlank(message = "username is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,20}$", message = "Username wrong format")
    private String username;
    @Pattern(regexp = "^[a-zA-Z0-9]{6,20}$", message = "Password wrong format")
    private String password;
    @NotBlank(message = "email is required")
    private String email;


}



