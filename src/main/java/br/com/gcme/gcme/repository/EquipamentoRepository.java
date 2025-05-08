package br.com.gcme.gcme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gcme.gcme.entity.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
    
    Equipamento findByNomeEquip(String nomeEquip);
}
