package com.gcme.mvp.dto;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

public class EquipamentoRequestDto {
    
    private String nomeEquip;
    private String descricaoEquip;
    private LocalDate dataManutencao;
    private LocalDate proximaManutencao;
    private int codigoEquip; 
    private String marcaEquip;
    private float rangeTipo;
    private String numeroSerie;
    private String modelo;
    

    public String getNomeEquip() { return nomeEquip; }
    public void setNomeEquip(String nomeEquip) { this.nomeEquip = nomeEquip; }

    public String getDescricaoEquip() { return descricaoEquip; }
    public void setDescricaoEquip(String descricaoEquip) { this.descricaoEquip = descricaoEquip; }

    public LocalDate getDataManutencao() { return dataManutencao; }
    public void setDataManutencao(LocalDate dataManutencao) { this.dataManutencao = dataManutencao; }

    public LocalDate getProximaManutencao() { return proximaManutencao; }
    public void setProximaManutencao(LocalDate proximaManutencao) { this.proximaManutencao = proximaManutencao; }

    public int getCodigoEquip() { return codigoEquip; }
    public void setCodigoEquip(int codigoEquip) { this.codigoEquip = codigoEquip; }

    public String getMarcaEquip() { return marcaEquip; }
    public void setMarcaEquip(String marcaEquip) { this.marcaEquip = marcaEquip; }

    public float getRangeTipo() { return rangeTipo; }
    public void setRangeTipo(float rangeTipo) { this.rangeTipo = rangeTipo; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
