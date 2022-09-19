package com.techerasolutions.service;

import com.techerasolutions.model.EmployeeRequest;
import com.techerasolutions.repository.EmployeeRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeRequestService {

    private final EmployeeRequestRepository employeeRequestRepository;

    public EmployeeRequest save(EmployeeRequest employeeRequest) {
       return employeeRequestRepository.save(employeeRequest);
    }


}
