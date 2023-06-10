package org.example.dto;

import lombok.*;
import org.example.enam.ProfileRole;
import org.example.enam.Status;


import java.time.LocalDate;

import static org.example.enam.ProfileRole.ADMIN;
import static org.example.enam.Status.ACTIV;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Profile {
    private String name;
    private String surname;
    private String phone; //unique,
    private String passwd;
    private LocalDate created_date = LocalDate.now();
    private String status = String.valueOf(Status.ACTIV);
    private String role = String.valueOf(ProfileRole.ADMIN);

}
