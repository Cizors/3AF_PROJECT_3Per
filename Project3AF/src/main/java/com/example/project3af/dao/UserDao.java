package com.example.project3af.dao;

import com.example.project3af.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao implements IUserDao{

    Connection conn;

    public UserDao(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(User user) {
        try {
            PreparedStatement statement = conn.prepareStatement
                    ("INSERT INTO LANDLORDS_USER(EMAIL, FULL_NAME, BIRTHDATE, " +
                            "PHONE_NUMBER, CPF, BANK_ACC_NUMBER, " +
                            "BANK_CODE, BANK_AGENCY, ACC_TYPE, PASSWORD) " +
                            "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?))");
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getFullName());
            statement.setString(3, user.getBirthDate());
            statement.setString(4, user.getPhoneNumber());
            statement.setString(5, user.getCpf());
            statement.setString(6, user.getBankAccNumber());
            statement.setInt(7, user.getBankCode());
            statement.setString(8, user.getBankAgency());
            statement.setString(9, user.getAccType());
            statement.setString(10, user.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public void findByID(Integer id) {

    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
