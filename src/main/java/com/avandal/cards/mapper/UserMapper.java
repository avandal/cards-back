package com.avandal.cards.mapper;

import com.avandal.cards.dto.UserDTO;
import com.avandal.cards.model.User;

import java.util.Optional;

public class UserMapper {
    public static Optional<User> userDTOToUser(UserDTO userDTO) {
        if (userDTO == null) {
            return Optional.empty();
        }

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword((userDTO.getPassword()));
        user.setAuthority(userDTO.getAuthority());
        user.setEnabled(userDTO.isEnabled());

        return Optional.of(user);
    }

    public static Optional<UserDTO> userToUserDTO(User user) {
        if (user == null) {
            return Optional.empty();
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword((user.getPassword()));
        userDTO.setAuthority(user.getAuthority());
        userDTO.setEnabled(user.isEnabled());

        return Optional.of(userDTO);
    }
}
