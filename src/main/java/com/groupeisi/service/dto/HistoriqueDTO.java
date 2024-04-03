package com.groupeisi.service.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
public class HistoriqueDTO {

    private Long id;
    private LocalDateTime searchDate;
    private String request;
    private String responseDate;
    private String responseDay;

    // Getters and setters
}
