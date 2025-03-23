package org.prashanthvangari.patientservice.mapper;

import org.prashanthvangari.patientservice.dto.PatientRequestDTO;
import org.prashanthvangari.patientservice.dto.PatientResponseDTO;
import org.prashanthvangari.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setEmail(patient.getEmail());
        return patientResponseDTO;
    }
    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient patient = Patient.builder()
                        .name(patientRequestDTO.getName())
                        .address(patientRequestDTO.getAddress())
                        .email(patientRequestDTO.getEmail())
                        .dateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()))
                        .registeredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()))
                .build();
        return patient;
    }
}
