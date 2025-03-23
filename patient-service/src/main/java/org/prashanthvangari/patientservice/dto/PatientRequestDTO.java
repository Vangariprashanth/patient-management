package org.prashanthvangari.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.prashanthvangari.patientservice.dto.validators.CreatePatientValidationGroup;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientRequestDTO {
    @NotBlank
    @Size(max=100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(groups = CreatePatientValidationGroup.class, message = "Email should be valid" )
    private String email;

    @NotBlank(message = "Date of Birth is required")
    private String dateOfBirth;

    @NotBlank(message = "Address is required")
    private String address;

    @NotNull(groups = CreatePatientValidationGroup.class, message = "Registered date is required")
    private String registeredDate;

}
