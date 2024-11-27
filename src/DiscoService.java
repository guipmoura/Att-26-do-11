package com.example.catalogo.services;

import com.example.catalogo.models.Disco;
import com.example.catalogo.repositories.DiscoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscoService {
    @Autowired
    private DiscoRepository repo;

    public List<Disco> listar() {
        return repo.findAll();
    }
    public Disco salvar(Disco disco) {
        return repo.save(disco);
    }
    public void excluir(Long id) {
        repo.deleteById(id);
    }
}
