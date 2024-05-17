package com.onlineStoreZeal.onlineStoreZeal.entities;

import com.onlineStoreZeal.onlineStoreZeal.dto.UserDTO;
import com.onlineStoreZeal.onlineStoreZeal.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

    private byte[] img;

//    public UserDTO mapUserToUserDTO(){
//        return new UserDTO(id,email,name,userRole);
//    }

}
