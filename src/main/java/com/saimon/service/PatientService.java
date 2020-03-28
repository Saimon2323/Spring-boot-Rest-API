package com.saimon.service;

import com.saimon.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    public void addPatient(Patient patient);

    public void updatePatient(Patient patient);

    public Optional<Patient> getPatientById(int id);

    public List<Patient> getAllPatients();

    public Optional<Patient> getPatientByPatientName(String name);

    public List<String> getAllPatientsByKey(String patientName);

    public void deletePatient(int id);
}
