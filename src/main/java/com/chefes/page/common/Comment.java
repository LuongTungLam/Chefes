package com.chefes.page.common;

import com.chefes.page.entity.Event;
import com.chefes.page.entity.Pricing;
import com.chefes.page.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@Getter
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private int status;

    @Builder
    public Comment(User user, Event event, String comment, int status) {
        this.user = user;
        this.event = event;
        this.comment = comment;
        this.status = status;
    }

}
