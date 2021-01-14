package com.chefes.page.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "feedback")
@Getter
@NoArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "content")
    private String content;

    @Column(name = "crate_date")
    private LocalDate createDate;

    @Column(name = "status")
    private int status;

    @Builder
    public Feedback(String fullName, String email, String content, LocalDate createDate, int status) {
        this.fullName = fullName;
        this.email = email;
        this.content = content;
        this.createDate = createDate;
        this.status = status;
    }
}
