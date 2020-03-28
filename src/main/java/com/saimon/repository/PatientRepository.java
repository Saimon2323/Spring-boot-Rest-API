package com.saimon.repository;

import com.saimon.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//JpaRepository extends CrudRepository. So its better to use JpaRepository and also efficient.
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Optional<Patient> findByPatientName(String patientName);
}
