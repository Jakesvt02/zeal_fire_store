package com.onlineStoreZeal.onlineStoreZeal.services.user;

import com.onlineStoreZeal.onlineStoreZeal.dto.SignupDTO;
import com.onlineStoreZeal.onlineStoreZeal.dto.UserDTO;

public interface UserService {

    UserDTO creatUser(SignupDTO signupDTO);

    boolean hashUserWithEmail(String email);
}
