package com.example.catalogo.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;

    @ManyToMany(mappedBy = "artistas")
    private List<Disco> discos;
}
