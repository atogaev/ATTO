package org.example.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Card {

    private String number;
    private Double balance;
    private String status;
    private String phone;
    private LocalDate exp_date;
    private LocalDateTime created_date;


}
