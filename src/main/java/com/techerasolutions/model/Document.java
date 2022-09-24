package com.techerasolutions.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "document")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    String name;


}
