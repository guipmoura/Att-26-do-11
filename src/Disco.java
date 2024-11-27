package com.example.catalogo.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Disco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int anoLancamento;

    @OneToMany(mappedBy = "disco", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Faixa> faixas;

    @ManyToMany
    @JoinTable(
            name = "disco_artista",
            joinColumns = @JoinColumn(name = "disco_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id")
    )
    private List<Artista> artistas;
}
