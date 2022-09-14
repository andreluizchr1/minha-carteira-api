package com.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carteira.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
