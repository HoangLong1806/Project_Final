/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package org.example.projectfinal.response;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   10/04/2024
 *vesion: 1.0
 */

import lombok.Getter;
import lombok.Setter;
import org.example.projectfinal.constant.WrapResponseStatus;

@Getter
@Setter

public class WapResponse<T> {
    private String statusCode;
    private T data;
    private String message;

    public static <T> WapResponse<T> ok(T data) {
        WapResponse<T> response = new WapResponse();
        response.setStatusCode(WrapResponseStatus.SUCCESS);
        response.setData(data);

        return response;
    }

    public static <T> WapResponse<T> error(String message) {
        WapResponse<T> response = new WapResponse();
        response.setData(null);
        response.setStatusCode(WrapResponseStatus.INTERNAL_SERVER_ERROR);
        response.setMessage(message);


        return response;
    }
}



