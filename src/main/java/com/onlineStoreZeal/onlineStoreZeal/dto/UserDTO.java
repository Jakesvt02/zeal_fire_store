package com.onlineStoreZeal.onlineStoreZeal.dto;

import com.onlineStoreZeal.onlineStoreZeal.enums.UserRole;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

    private byte[] img;

    public UserDTO() {
    }
}
