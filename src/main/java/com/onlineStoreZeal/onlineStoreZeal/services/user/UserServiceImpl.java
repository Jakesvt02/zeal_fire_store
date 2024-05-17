package com.onlineStoreZeal.onlineStoreZeal.services.user;

import com.onlineStoreZeal.onlineStoreZeal.dto.SignupDTO;
import com.onlineStoreZeal.onlineStoreZeal.dto.UserDTO;
import com.onlineStoreZeal.onlineStoreZeal.entities.User;
import com.onlineStoreZeal.onlineStoreZeal.enums.UserRole;
import com.onlineStoreZeal.onlineStoreZeal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO creatUser(SignupDTO signupDTO) {
        User user = new User();
        user.setName(signupDTO.getName());
        user.setEmail(signupDTO.getEmail());
        user.setUserRole(UserRole.USER);
        user.setPassword(new BCryptPasswordEncoder().encode(signupDTO.getPassword()));
        User createdUser = userRepository.save(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(createdUser.getId());
        userDTO.setName(createdUser.getName());
        userDTO.setEmail(createdUser.getEmail());
        userDTO.setUserRole(createdUser.getUserRole());

        return userDTO;
    }

    @Override
    public boolean hashUserWithEmail(String email) {
        return userRepository.findFirstByEmail(email)!=null;
    }

//    @Override
}
