package com.techerasolutions.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    Date fechaFin;
    Date fechaInicio;
    String name;

}
