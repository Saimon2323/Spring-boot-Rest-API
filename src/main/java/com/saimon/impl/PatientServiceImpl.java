package com.saimon.impl;

import com.saimon.models.Patient;
import com.saimon.repository.PatientRepository;
import com.saimon.service.PatientService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> getPatientById(int id) {
        return patientRepository.findById(id);
    }

    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;
    }

    @Override
    public Optional<Patient> getPatientByPatientName(String patientName) {
        return patientRepository.findByPatientName(patientName);
    }

    @Override
    public List<String> getAllPatientsByKey(String patientName) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        JSONArray jsonArray = new JSONArray(patients);
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString(patientName))
                .collect(Collectors.toList());

    }

    @Override
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }

}
