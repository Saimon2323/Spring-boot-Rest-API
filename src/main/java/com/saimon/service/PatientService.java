package com.saimon.service;

import com.saimon.models.PatientEntity;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    public void addPatient(PatientEntity patientEntity);

    public void updatePatient(PatientEntity patientEntity);

    public Optional<PatientEntity> getPatientById(int id);

    public List<PatientEntity> getAllPatients();

    public Optional<PatientEntity> getPatientByPatientName(String name);

    public List<String> getAllPatientsByKey(String patientName);

    public void deletePatient(int id);
}
