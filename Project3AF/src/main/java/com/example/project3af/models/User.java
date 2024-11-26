package com.example.project3af.models;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {

    private Long id;
    private String email;
    private String fullName;
    private String birthDate;
    private String phoneNumber;
    private String cpf;
    private String bankAccNumber;
    private Integer bankCode;
    private String bankAgency;
    private String accType;
    private String password;

    public User() {
    }

    public User(String email, String fullName, String birthDate, String phoneNumber,
                String cpf, String bankAccNumber, Integer bankCode,
                String bankAgency, String accType, String password) {
        this.email = email;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.cpf = cpf;
        this.bankAccNumber = bankAccNumber;
        this.bankCode = bankCode;
        this.bankAgency = bankAgency;
        this.accType = accType;
        this.password = password;
    }

    public User(Long id, String email, String fullName, String birthDate,
                String phoneNumber, String cpf, String bankAccNumber,
                Integer bankCode, String bankAgency, String accType, String password) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.cpf = cpf;
        this.bankAccNumber = bankAccNumber;
        this.bankCode = bankCode;
        this.bankAgency = bankAgency;
        this.accType = accType;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBankAccNumber() {
        return bankAccNumber;
    }

    public Integer getBankCode() {
        return bankCode;
    }

    public String getBankAgency() {
        return bankAgency;
    }

    public String getAccType() {
        return accType;
    }

    public String getPassword() {
        return password;
    }
}
