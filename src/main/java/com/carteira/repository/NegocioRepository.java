package com.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carteira.domain.Negocio;

public interface NegocioRepository extends JpaRepository<Negocio, Long> {

}
