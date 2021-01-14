package com.chefes.page.common;

import com.chefes.page.entity.Pricing;
import com.chefes.page.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_pricing")
@Getter
@NoArgsConstructor
public class UserPricing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "pricing_id")
    private Pricing pricing;

    @Column(name = "time_expire")
    private LocalDate timeExpire;

    @Column(name = "status")
    private int status;

    @Builder
    public UserPricing(User user, Pricing pricing, LocalDate timeExpire, int status) {
        this.user = user;
        this.pricing = pricing;
        this.timeExpire = timeExpire;
        this.status = status;
    }
}
