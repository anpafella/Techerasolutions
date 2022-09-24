package com.techerasolutions.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    String apellidos;
    String nombre;
    String telefono;
    String codigo;
    String correoEmpresa;
    String correoPersonal;
    String dni;
    String estado;
    Date fechaIngreso;
    Date fechaSalida;

}
