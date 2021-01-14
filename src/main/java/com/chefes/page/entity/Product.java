package com.chefes.page.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "recipe")
    private String recipe;

    @Column(name = "status")
    private int status;

    @Builder
    public Product(String name, String recipe, int status) {
        this.name = name;
        this.recipe = recipe;
        this.status = status;
    }
}
