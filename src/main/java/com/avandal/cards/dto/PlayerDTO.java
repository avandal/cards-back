package com.avandal.cards.dto;

import java.util.Objects;

public class PlayerDTO {
    private String username;

    public PlayerDTO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PlayerDTO)) {
            return false;
        }
        PlayerDTO playerDTO = (PlayerDTO) o;
        return Objects.equals(username, playerDTO.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }

    @Override
    public String toString() {
        return "{" + " username='" + username + "'" + "}";
    }
}