package com.saimon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement  // for generating result in xml format. eta dile o chole abar na dile problem nai.
@Entity(name = "patient_info")
public class PatientEntity {

    @Id
    @GeneratedValue
    @NotNull
    private int patientId;

    @NotNull
    private String patientName;

    @NotNull
    private String patientAddress;

    @NotNull
    private int patientAge;

    @NotNull
    private String patientContactNo;

    @NotNull
    private String patientEmail;

    public PatientEntity() {
    }

//    public PatientEntity(int patientId, String patientName, String patientAddress, int patientAge, String patientContactNo, String patientEmail) {
//        super();
//        this.patientId=patientId;
//        this.patientName=patientName;
//        this.patientAddress=patientAddress;
//        this.patientAge=patientAge;
//        this.patientContactNo=patientContactNo;
//        this.patientEmail=patientEmail;
//    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientContactNo() {
        return patientContactNo;
    }

    public void setPatientContactNo(String patientContactNo) {
        this.patientContactNo = patientContactNo;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
}
