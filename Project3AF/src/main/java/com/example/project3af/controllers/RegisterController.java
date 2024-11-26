package com.example.project3af.controllers;

import com.example.project3af.MainApplication;
import com.example.project3af.models.User;
import com.example.project3af.services.UserService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class RegisterController {


    @FXML
    public Button LoginPageButton;

    @FXML
    public Text HomeName;

    @FXML
    public TextField RegisterEmail;
    @FXML
    public TextField RegisterFullName;
    @FXML
    public TextField RegisterBirthDate;
    @FXML
    public TextField RegisterPhoneNumber;
    @FXML
    public TextField RegisterCPF;
    @FXML
    public TextField RegisterBankAccNumber;
    @FXML
    public TextField RegisterBankCode;
    @FXML
    public TextField RegisterBankAgency;
    @FXML
    public TextField RegisterAccountType;
    @FXML
    public TextField RegisterPassword1;
    @FXML
    public TextField RegisterPassword2;

    @FXML
    public Button RegisterButton;

    @FXML
    public void OpenLoginPage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Login");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void OpenHomePage() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-renter-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Initial");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void SaveRegisterInformation() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle("IsTudent Login");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(RegisterEmail.getText());
        System.out.println(RegisterFullName.getText());
        System.out.println(RegisterBirthDate.getText());
        System.out.println(RegisterPhoneNumber.getText());
        System.out.println(RegisterCPF.getText());
        System.out.println(RegisterBankAccNumber.getText());
        System.out.println(RegisterBankCode.getText());
        System.out.println(RegisterBankAgency.getText());
        System.out.println(RegisterAccountType.getText());
        System.out.println(RegisterPassword1.getText());
    }
}
