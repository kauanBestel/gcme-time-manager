package com.gcme.mvp.model;

import java.time.LocalDate;

import com.gcme.mvp.model.imagens.DadosImagemEquip;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipamento")
@Getter
@Setter
public class EquipamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEquip;
    private String descricaoEquip;
    private LocalDate dataManutencao;
    private LocalDate proximaManutencao;
    
    private int codigoEquip; 
    private String marcaEquip;
    private float rangeTipo;
    private String numeroSerie;
    private String modelo;

    @OneToOne
    @JoinColumn(name = "imagem_id")
    private DadosImagemEquip imagem;

    
    //private String caminhoImagem;
}

