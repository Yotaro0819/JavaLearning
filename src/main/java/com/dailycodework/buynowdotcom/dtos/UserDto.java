package com.dailycodework.buynowdotcom.dtos;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
//    private String firstName;
//    private String lastName;
    private String email;
    private String username;

    public UserDto(Long id, String firstName, String lastName, String email) {
        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.email = email;
        this.username = firstName + " " + lastName;
    }
}
