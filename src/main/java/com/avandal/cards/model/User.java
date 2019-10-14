package com.avandal.cards.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user")
@SecondaryTable(name = "authorities")
public class User implements UserDetails {
    @Id @Column @Getter @Setter
    private String username;

    @Column @Getter @Setter
    private String password;

    @Column(table = "authorities") @Getter @Setter
    private String authority;

    @Column @Getter @Setter
    private boolean enabled;

    public User() {}

    public User(String username, String password, boolean enabled, String authority) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;

        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return enabled == user.enabled &&
                username.equals(user.username) &&
                password.equals(user.password) &&
                authority.equals(user.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, enabled, authority);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled + '\'' +
                ", authority=" + authority +
                '}';
    }
}
