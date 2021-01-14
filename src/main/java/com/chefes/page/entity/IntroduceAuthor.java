package com.chefes.page.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "introduceAuthor")
@Getter
@NoArgsConstructor
public class IntroduceAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private int status;

    @Builder
    public IntroduceAuthor(String name,LocalDate dob,String content,int status){
        this.name = name;
        this.dob = dob;
        this.content = content;
        this.status = status;
    }
}
