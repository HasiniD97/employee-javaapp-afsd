package lk.hasi.employeemanagement.service.impl;

import lk.hasi.employeemanagement.db.Database;
import lk.hasi.employeemanagement.dto.EmployeeDto;
import lk.hasi.employeemanagement.entity.Employee;
import lk.hasi.employeemanagement.service.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl  implements EmployeeService {


    @Override
    public boolean saveEmployee(EmployeeDto employeeDto) {

        Database.employees.add(new Employee(employeeDto.getName(),employeeDto.getId(),employeeDto.getAddress(),employeeDto.getPosition()));

        return true;
    }

    @Override
    public boolean updateEmployee(EmployeeDto employeeDto) {

       for (Employee employee: Database.employees){
           if (employee.getId()==employeeDto.getId()){
               employee.setName(employeeDto.getName());
               employee.setAddress(employeeDto.getAddress());
               employee.setPosition(employeeDto.getPosition());
               return true;
           }
       }

        return false;
    }


    //    ------------------
    @Override
    public Boolean deleteEmployee(int id) {
        for (int i=0;i<Database.employees.size();i++){
            if (Database.employees.get(i).getId() == id){
                Database.employees.remove(i);
                return true;
            }

            }

        return false;
    }


//    ------------------------------------------------------------------------
    @Override
    public ArrayList<EmployeeDto> getAllDetail() {

        ArrayList<EmployeeDto> employeeDtos = new ArrayList<>();

        for (Employee e : Database.employees){
            employeeDtos.add(new EmployeeDto(e.getId(),e.getName(),e.getAddress(),e.getPosition()));
        }

        return  employeeDtos;
    }

}
