/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package org.example.projectfinal.controller;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   10/04/2024
 *vesion: 1.0
 */

import lombok.extern.log4j.Log4j2;
import org.example.projectfinal.request.user.SignupRequest;
import org.example.projectfinal.response.WapResponse;
import org.example.projectfinal.response.user.UserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Log4j2
public class UserController {
    @PostMapping("/signup")
    public WapResponse<UserResponse> signup(@RequestBody @Valid SignupRequest request) {
        log.info("Request signup: {}", request);
        UserResponse res = UserResponse.builder()
                .id("id")
                .username(request.getUsername())
                .email(request.getEmail())
                .build();
        return WapResponse.ok(res);
    }
}



