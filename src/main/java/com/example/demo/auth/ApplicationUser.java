package com.example.demo.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ApplicationUser implements UserDetails {
    private final Set<? extends GrantedAuthority> authorities;
    private final String userName;
    private final String password;
    private final Boolean isAccountNonExpired;
    private final Boolean isAccountNonLocked;
    private final Boolean isCredentialsNonExpired;
    private final Boolean isEnabled;

    public ApplicationUser(Set<? extends GrantedAuthority> authorities,
                           String userName,
                           String password,
                           Boolean isAccountNonExpired,
                           Boolean isAccountNonLocked,
                           Boolean isCredentialsNonExpired,
                           Boolean isEnabled) {
        this.authorities = authorities;
        this.userName = userName;
        this.password = password;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
