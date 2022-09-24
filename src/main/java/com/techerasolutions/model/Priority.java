package com.techerasolutions.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "priority")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    String description;
}
