package org.prashanthvangari.patientservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponseDTO {
    private UUID id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String email;
}
