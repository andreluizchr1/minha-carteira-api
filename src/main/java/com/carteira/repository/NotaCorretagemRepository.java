package com.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carteira.domain.NotaCorretagem;

public interface NotaCorretagemRepository extends JpaRepository<NotaCorretagem, Long>{

}
