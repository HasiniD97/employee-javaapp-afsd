package lk.hasi.employeemanagement.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.hasi.employeemanagement.dto.EmployeeDto;
import lk.hasi.employeemanagement.service.EmployeeService;
import lk.hasi.employeemanagement.service.impl.EmployeeServiceImpl;

import java.util.ArrayList;

public class EmployeeDetailFormController {


    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPosition;

    @FXML
    void btnCloseOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

        int id = Integer.parseInt(txtId.getText());

        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean isDeleted = employeeService.deleteEmployee(id);

        if(isDeleted){
            System.out.println("Employee details deleted successfully!");
        }
        else
            System.out.println("Error");

    }

    @FXML
    void btnGetAllOnAction(ActionEvent event) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        ArrayList<EmployeeDto> showAllDetails = employeeService.getAllDetail();

        for (EmployeeDto emp : showAllDetails){
            System.out.println(emp.getId()+" " + emp.getName()+" " + emp.getAddress()+" " + emp.getPosition());
        }


    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String address = txtAddress.getText();
        String position = txtPosition.getText();

        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean isUpdated = employeeService.updateEmployee(new EmployeeDto(id, name, address, position));

        if(isUpdated){
            System.out.println("Employee details updated successfully!");
        }
        else
            System.out.println("Error");

        System.out.println("Hellow");
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String address = txtAddress.getText();
        String position = txtPosition.getText();

        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean isSaved = employeeService.saveEmployee(new EmployeeDto(id, name, address, position));

        if(isSaved){
            System.out.println("Employee details saved successfully!");
        }
        else
            System.out.println("Error");
    }


}
