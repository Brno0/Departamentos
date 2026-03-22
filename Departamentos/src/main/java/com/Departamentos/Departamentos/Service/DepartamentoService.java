package com.Departamentos.Departamentos.Service;

import com.Departamentos.Departamentos.Entity.Departamento;
import com.Departamentos.Departamentos.Repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public Departamento salvar(Departamento departamento) {
        return repository.save(departamento);
    }

    public List<Departamento> listarTodos() {
        return repository.findAll();
    }

    public Departamento buscarPorId(Long id) {
        Optional<Departamento> departamento = repository.findById(id);
        return departamento.orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}