package com.example.spring.data.transfer.objects;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    public int employee_id;
    private String first_name;
    private String last_name;
}
