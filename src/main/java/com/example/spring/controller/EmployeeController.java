package com.example.spring.controller;

import com.example.spring.service.AuthenticationService;
import com.example.spring.data.transfer.objects.EmployeeDTO;
import com.example.spring.data.transfer.objects.MessageDTO;
import com.example.spring.domain.EmployeeDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(path = "/hello")
    public MessageDTO getHello() {
        log.info("GET Call received at employee/hello");
        return authenticationService.getHello();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public MessageDTO registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
        log.info("POST Call received at employee/register with DTO" + employeeDTO);
        return authenticationService.registerEmployee(employeeDTO);
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Optional<EmployeeDomain> getEmployeeInformation(@RequestParam("emp_id") int employeeId) {
        log.info("GET Call received at employee/info with emp_id" + employeeId);
        return authenticationService.getEmployeeInformation(employeeId);
    }
}

