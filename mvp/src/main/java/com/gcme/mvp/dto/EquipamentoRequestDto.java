package com.gcme.mvp.dto;

import java.time.LocalDate;

public record EquipamentoRequestDto(
    String nomeEquip,
    String descricaoEquip,
    LocalDate dataManutencao,
    LocalDate proximaManutencao,
    int codigoEquip, 
    String marcaEquip,
    float rangeTipo,
    String numeroSerie,
    String modelo
){}

