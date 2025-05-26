package com.gcme.mvp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcme.mvp.model.imagens.DadosImagemEquip;


public interface ImagemRepository extends JpaRepository <DadosImagemEquip, Long> {
   Optional<DadosImagemEquip> findByNome(String nome);
}
