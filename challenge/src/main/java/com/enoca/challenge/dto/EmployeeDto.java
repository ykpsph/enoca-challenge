package com.enoca.challenge.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    private Long departmentId;
    private String departmentName;
}
