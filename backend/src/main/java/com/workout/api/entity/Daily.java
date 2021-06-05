package com.workout.api.entity;

import com.workout.api.entity.common.CommonDateEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Daily extends CommonDateEntity {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(length = 100)
    private int weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bid")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    private User user;

    // 생성자
    public Daily(User user, Board board, String email, int weight) {
        this.user = user;
        this.board = board;
        this.email = email;
        this.weight = weight;
    }

    public Daily setUpdate(String email, int weight) {
        this.email = email;
        this.weight = weight;
        return this;
    }
}