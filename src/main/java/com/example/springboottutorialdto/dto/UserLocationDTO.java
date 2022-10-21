package com.example.springboottutorialdto.dto;

import lombok.Data;

@Data
//Data transfer object
public class UserLocationDTO {
    private String userId;
    private String email;
    private String place;
    private  double longitude;
    private  double latitude;

}
