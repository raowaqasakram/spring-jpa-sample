package com.example.spring.service;

import com.example.spring.data.transfer.objects.EmployeeDTO;
import com.example.spring.data.transfer.objects.MessageDTO;
import com.example.spring.domain.EmployeeDomain;
import com.example.spring.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AuthenticationService {
    private final Logger log = LoggerFactory.getLogger(AuthenticationService.class);

    @Autowired
    private EmployeeRepository employeeRepository;


    public MessageDTO getHello() {
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Hello to the future ! ");
        return messageDTO;
    }

    public MessageDTO registerEmployee(EmployeeDTO employeeDTO) {
        EmployeeDomain employeeDomain = new EmployeeDomain();
        employeeDomain.setFirst_name(employeeDTO.getFirst_name());
        employeeDomain.setLast_name(employeeDTO.getLast_name());
        employeeRepository.save(employeeDomain);

        String responseMessage = "Employee has been register with ID " + employeeDomain.getEmployee_id();
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage(responseMessage);
        log.info(responseMessage);
        return messageDTO;
    }

    public Optional<EmployeeDomain> getEmployeeInformation(int employeeId) {
        return employeeRepository.findById(employeeId);
    }
}