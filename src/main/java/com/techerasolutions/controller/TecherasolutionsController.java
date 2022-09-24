package com.techerasolutions.controller;

import com.techerasolutions.model.EmployeeRequest;
import com.techerasolutions.repository.EmployeeRequestRepository;
import com.techerasolutions.service.EmployeeRequestService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("employee-request")
@RequiredArgsConstructor
public class TecherasolutionsController {

    private final EmployeeRequestService employeeRequestService;
    private final EmployeeRequest employeeRequest;
    private final EmployeeRequestRepository employeeRequestRepository;

    @PostMapping
    public EmployeeRequest save(@RequestBody EmployeeRequest employeeRequest) {
        return employeeRequestService.save(employeeRequest);
    }

    @GetMapping("/{id}")
    public EmployeeRequest getById(@PathVariable Long id){
        return employeeRequestService.getById(id);
        /*EmployeeRequest response= employeeRequestService.getById(id);
        if (response == null){
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(response, HttpStatus.OK);
        }*/
    }


    @DeleteMapping("/{id}")
    public EmployeeRequest deleteById(@PathVariable Long id) {
        return employeeRequestService.deleteById(id);
    }
}
