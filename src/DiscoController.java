package com.example.catalogo.controllers;

import com.example.catalogo.models.Disco;
import com.example.catalogo.services.DiscoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/discos")
public class DiscoController {
    @Autowired
    private DiscoService service;

    @GetMapping
    public List<Disco> listar() {
        return service.listar();
    }
    @PostMapping
    public Disco salvar(@RequestBody Disco disco) {
        return service.salvar(disco);
    }
    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        service.excluir(id);
    }
}
