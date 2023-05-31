package com.salbiyath.springboot.mapper;

import com.salbiyath.springboot.dto.EmployeeDto;
import com.salbiyath.springboot.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto employeeDto(Employee employee){
        return new EmployeeDto(employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail());
    }

}
