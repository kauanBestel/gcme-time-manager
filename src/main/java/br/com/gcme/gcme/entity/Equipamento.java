package br.com.gcme.gcme.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipamentos")
public class Equipamento {
    @Id
    private long id;
    private long codigo_equip;
    private String nome_equip;
    private String marca_equip;
    private String descricao;
    private String range_tipo;
    private String imagem;
    private String numero_serie;
    private String modelo;
    private LocalDateTime tempo_manutencao;

    
    public Equipamento(){
        
    }
    
    public Equipamento(long id, long codigo_equip, String nome_equip, String marca_equip, String descricao,
            String range_tipo, String imagem, String numero_serie, String modelo, LocalDateTime tempo_manutencao,
            Mdo empresa) {
        this.id = id;
        this.codigo_equip = codigo_equip;
        this.nome_equip = nome_equip;
        this.marca_equip = marca_equip;
        this.descricao = descricao;
        this.range_tipo = range_tipo;
        this.imagem = imagem;
        this.numero_serie = numero_serie;
        this.modelo = modelo;
        this.tempo_manutencao = tempo_manutencao;
        this.empresa = empresa;
    }
    @ManyToOne
    @JoinColumn(name = "mdo_manutencao_id")
    private Mdo empresa;
    

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getCodigo_equip() {
        return codigo_equip;
    }
    public void setCodigo_equip(long codigo_equip) {
        this.codigo_equip = codigo_equip;
    }

    public String getNome_equip() {
        return nome_equip;
    }
    public void setNome_equip(String nome_equip) {
        this.nome_equip = nome_equip;
    }

    public String getMarca_equip() {
        return marca_equip;
    }
    public void setMarca_equip(String marca_equip) {
        this.marca_equip = marca_equip;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRange_tipo() {
        return range_tipo;
    }
    public void setRange_tipo(String range_tipo) {
        this.range_tipo = range_tipo;
    }

    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNumero_serie() {
        return numero_serie;
    }
    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @PrePersist
    protected void onCreate(){
        this.tempo_manutencao = LocalDateTime.now();
    }
    public LocalDateTime getTempo_manutencao() {
        return tempo_manutencao;
    }
    public void setTempo_manutencao(LocalDateTime tempo_manutencao) {
        this.tempo_manutencao = tempo_manutencao;
    }

    public Mdo getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Mdo empresa) {
        this.empresa = empresa;
    }



}
