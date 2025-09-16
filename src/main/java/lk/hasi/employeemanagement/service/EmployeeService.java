package lk.hasi.employeemanagement.service;

import lk.hasi.employeemanagement.dto.EmployeeDto;

import java.util.ArrayList;

public interface EmployeeService {

    boolean saveEmployee(EmployeeDto employeeDto);

    boolean updateEmployee(EmployeeDto employeeDto);

    Boolean deleteEmployee(int id);

    ArrayList<EmployeeDto> getAllDetail();
}
