package com.Departamentos.Departamentos.Repository;

import com.Departamentos.Departamentos.Entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}