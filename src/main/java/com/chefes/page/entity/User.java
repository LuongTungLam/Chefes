package com.chefes.page.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "birth_day", length = 100)
    private Date birth_day;

    @Column(name = "statusUser", length = 100)
    private int statusUser;

    @Builder
    public User(String name,String phone,String email,String password,String city, Date birth_day, int statusUser){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.city = city;
        this.birth_day = birth_day;
        this.statusUser = statusUser;
    }
}
