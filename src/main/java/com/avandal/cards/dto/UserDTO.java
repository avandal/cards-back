package com.avandal.cards.dto;

import lombok.Getter;
import lombok.Setter;

public class UserDTO {
    @Getter @Setter
    private String username;

    @Getter @Setter
    private String password;

    @Getter @Setter
    private String authority;

    @Getter @Setter
    private boolean enabled;


}
