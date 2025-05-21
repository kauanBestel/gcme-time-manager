package com.gcme.mvp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipamento")
@Getter
@Setter
public class EquipamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeEquip;
    private String descricaoEquip;
    private LocalDate dataManutencao;
    private LocalDate proximaManutencao;
}

