package com.carteira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carteira.domain.Corretora;

public interface CorretoraRepository extends JpaRepository<Corretora, Long> {

	public List<Corretora> findByStatus(Boolean status);
}
