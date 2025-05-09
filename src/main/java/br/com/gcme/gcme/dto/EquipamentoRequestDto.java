package br.com.gcme.gcme.dto;

import java.time.LocalDateTime;

public class EquipamentoRequestDto {

    public Long codigoEquip;
    public String nomeEquip;
    public String marcaEquip;
    public String descricao;
    public String rangeTipo;
    public String imagem;
    public String numeroSerie;
    public String modelo;
    public LocalDateTime tempoManutencao;
    public LocalDateTime tempo;

    public Long empresaManutencaoId; //o id da empresa de manutenção vai aqui

    public Long getCodigoEquip() {
        return codigoEquip;
    }
    public void setCodigoEquip(Long codigoEquip) {
        this.codigoEquip = codigoEquip;
    }
    public String getNomeEquip() {
        return nomeEquip;
    }
    public void setNomeEquip(String nomeEquip) {
        this.nomeEquip = nomeEquip;
    }
    public String getMarcaEquip() {
        return marcaEquip;
    }
    public void setMarcaEquip(String marcaEquip) {
        this.marcaEquip = marcaEquip;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getRangeTipo() {
        return rangeTipo;
    }
    public void setRangeTipo(String rangeTipo) {
        this.rangeTipo = rangeTipo;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public LocalDateTime getTempo_manutencao() {
        return tempoManutencao;
    }
    public void setTempo_manutencao(LocalDateTime tempoManutencao) {
        this.tempoManutencao = tempoManutencao;
    }
    public LocalDateTime getTempo() {
        return tempo;
    }
    public void setTempo(LocalDateTime tempo) {
        this.tempo = tempo;
    }
    public Long getEmpresaManutencaoId() {
        return empresaManutencaoId;
    }
    public void setEmpresaManutencaoId(Long empresaManutencaoId) {
        this.empresaManutencaoId = empresaManutencaoId;
    }

}
