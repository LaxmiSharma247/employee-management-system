package net.javaguids.ems.controller;

import lombok.AllArgsConstructor;
import net.javaguids.ems.dto.EmployeeDto;
import net.javaguids.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;
    //build Add Employee Rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //build get Employee rest api
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    //build get All Employees
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeeDtos = employeeService.getAllEmployees();
        return  ResponseEntity.ok(employeeDtos);
    }

    //build update employee rest api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody EmployeeDto employeeDto){
       EmployeeDto employeeDto1 =  employeeService.updateEmployee(employeeId,employeeDto);
       return ResponseEntity.ok(employeeDto1);
    }
    //build delete employee method
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee Deleted Successfully!");
    }
}
