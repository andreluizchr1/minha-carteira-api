package com.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carteira.domain.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long>{

}
