module lk.hasi.employeemanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.hasi.employeemanagement to javafx.fxml;
    exports lk.hasi.employeemanagement;
    exports lk.hasi.employeemanagement.controller;
    opens lk.hasi.employeemanagement.controller to javafx.fxml;
}