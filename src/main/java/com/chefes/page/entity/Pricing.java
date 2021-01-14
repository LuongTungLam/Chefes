package com.chefes.page.entity;

import com.chefes.page.common.Sub;
import com.chefes.page.common.UserPricing;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pricing")
@Getter
@ToString
@NoArgsConstructor
public class Pricing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "status")
    private int status;

    @Builder
    public Pricing(String name, double price, int status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }
}
