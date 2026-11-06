package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EmployeeController {

    @FXML
    private TableColumn<Employee, String> cityCol;

    @FXML
    private TextField cityField;

    @FXML
    private TableColumn<Employee, Integer> idCol;

    @FXML
    private TextField idField;

    @FXML
    private TableColumn<Employee, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<Employee, Integer> salaryCol;

    @FXML
    private TextField salaryField;

    @FXML
    private TableView<Employee> table;

    @FXML
    void onClickAddButton(ActionEvent event) {

    }

    @FXML
    void onClickDelButton(ActionEvent event) {

    }

    @FXML
    void onClickModifyButton(ActionEvent event) {

    }

    @FXML
    void onClickSaveButton(ActionEvent event) {

    }

}
