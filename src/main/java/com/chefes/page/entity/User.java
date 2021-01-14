package com.chefes.page.entity;

import com.chefes.page.common.Authority;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "phone", length = 100)
    private String phone;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "birth_day", length = 100)
    private LocalDate birth_day;

    @Column(name = "wallet")
    private String wallet;

    @Column(name = "status", length = 100)
    private int status;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_authorities", joinColumns = {
            @JoinColumn(name = "user_id")}, inverseJoinColumns = {
            @JoinColumn(name = "authority_id")})
    private Set<Authority> authorities = new HashSet<>();

    @Builder
    public User(String name, String phone, String email, String password, String address, LocalDate birth_day, String wallet, int status, Set<Authority> authorities) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
        this.birth_day = birth_day;
        this.wallet = wallet;
        this.status = status;
        this.authorities = authorities;
    }
}

