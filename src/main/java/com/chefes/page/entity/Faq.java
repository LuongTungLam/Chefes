package com.chefes.page.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "faq")
@Getter
@NoArgsConstructor
public class Faq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "answers")
    private String answers;

    @Column(name = "status")
    private int status;

    @Builder
    public Faq(String question,String answers,int status){
        this.question = question;
        this.answers = answers;
        this.status = status;
    }
}
