package com.tekion.dto;

import com.tekion.dto.Department;
import com.tekion.request.EmployeeRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name should not be null")
    private String name;

    @JoinColumn(name="department_id")
    @OneToOne
    private Department department;

    public Employee(EmployeeRequest req) {
        this.name = req.getName();
    }

}
