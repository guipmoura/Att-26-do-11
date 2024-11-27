package com.example.catalogo.models;

import jakarta.persistence.*;

@Entity
public class Faixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "disco_id", nullable = false)
    private Disco disco;
}
