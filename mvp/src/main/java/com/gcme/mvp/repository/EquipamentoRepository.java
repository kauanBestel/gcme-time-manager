package com.gcme.mvp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcme.mvp.model.EquipamentoModel;

@Repository
public interface EquipamentoRepository extends JpaRepository<EquipamentoModel,  Long> {
    
}
