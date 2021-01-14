package com.chefes.page.entity;

import com.chefes.page.common.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "event")
@Getter
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "crate_date")
    private LocalDate crateDate;

    @Column(name = "time_expire")
    private LocalDate timeExpire;

    @Column(name = "status")
    private int status;

    @Builder
    public Event(String name, String description, LocalDate crateDate, LocalDate timeExpire, int status) {
        this.name = name;
        this.description = description;
        this.crateDate = crateDate;
        this.timeExpire = timeExpire;
        this.status = status;
    }
}
