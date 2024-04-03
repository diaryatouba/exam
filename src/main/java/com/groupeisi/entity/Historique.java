package com.groupeisi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "historique")
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "search_date")
    private LocalDateTime searchDate;

    @Column(name = "request")
    private String request;

    @Column(name = "response_date")
    private String responseDate;

    @Column(name = "response_day")
    private String responseDay;
}
