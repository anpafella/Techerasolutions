package com.techerasolutions.service;

import com.techerasolutions.model.EmployeeRequest;
import com.techerasolutions.repository.EmployeeRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeRequestService {

    private final EmployeeRequestRepository employeeRequestRepository;

    public EmployeeRequest save(EmployeeRequest employeeRequest) {
       return employeeRequestRepository.save(employeeRequest);
    }

    public EmployeeRequest getById(Long id) {
        Optional<EmployeeRequest> optDeEmployee = employeeRequestRepository.findById(id);
        if(optDeEmployee.isPresent()){
            return optDeEmployee.get();
        }
        else {
            return null;
        }
    }

    public EmployeeRequest deleteById(Long id){
        if(getById(id).equals(employeeRequestRepository.findById(id))){
           employeeRequestRepository.delete(employeeRequestRepository.findBy(id));
        }
        return null;
    }
}
