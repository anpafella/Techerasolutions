package com.techerasolutions.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employeerequest")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name="creation_date")
    private Date creationDate;

    private String role;

    private String description;

}
