package com.example.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@ToString
@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "employee")
public class EmployeeDomain implements Serializable {
    private static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int employee_id;
    private String first_name;
    private String last_name;

    @Column(columnDefinition = "DATETIME")
    private String created_date;

    public EmployeeDomain() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        created_date = utc.format(DateTimeFormatter.ofPattern(DATETIME_FORMAT));
    }
}

