package br.com.gcme.gcme.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipamentos")
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long codigoEquip;
    private String nomeEquip;
    private String marcaEquip;
    private String descricao;
    private String rangeTipo;
    private String imagem;
    private String numeroSerie;
    private String modelo;
    private LocalDateTime tempo_manutencao;
    private LocalDateTime tempo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_manutencao_id")
    private EmpresaManutencao empresaManutencao;
    
    public Equipamento(){}
    
    public Equipamento(long id, long codigoEquip, String nomeEquip, String marcaEquip, String descricao,
            String rangeTipo, String imagem, String numeroSerie, String modelo, LocalDateTime tempo_manutencao,
            EmpresaManutencao empresaManutencao) {
        this.id = id;
        this.codigoEquip = codigoEquip;
        this.nomeEquip = nomeEquip;
        this.marcaEquip = marcaEquip;
        this.descricao = descricao;
        this.rangeTipo = rangeTipo;
        this.imagem = imagem;
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.tempo_manutencao = tempo_manutencao;
        this.empresaManutencao = empresaManutencao;
    }
    
    

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigo_equip(Long codigoEquip) {
        this.codigoEquip = codigoEquip;
    }

    public LocalDateTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalDateTime tempo) {
        this.tempo = tempo;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getCodigo_equip() {
        return codigoEquip;
    }
    public void setCodigo_equip(long codigoEquip) {
        this.codigoEquip = codigoEquip;
    }

    public String getNomeEquip() {
        return nomeEquip;
    }
    public void setNomeEquip(String nomeEquip) {
        this.nomeEquip = nomeEquip;
    }

    public String getMarca_equip() {
        return marcaEquip;
    }
    public void setMarca_equip(String marcaEquip) {
        this.marcaEquip = marcaEquip;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRange_tipo() {
        return rangeTipo;
    }
    public void setRange_tipo(String rangeTipo) {
        this.rangeTipo = rangeTipo;
    }

    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNumero_serie() {
        return numeroSerie;
    }
    public void setNumero_serie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
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

    public EmpresaManutencao getEmpresaManutencao() {
        return empresaManutencao;
    }
    public void setEmpresaManutencao(EmpresaManutencao empresaManutencao) {
        this.empresaManutencao = empresaManutencao;
    }
}
