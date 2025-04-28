package br.com.gcme.gcme.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import br.com.gcme.gcme.dto.EquipamentoRequest;
import br.com.gcme.gcme.dto.EquipamentoResponse;
import br.com.gcme.gcme.entity.Equipamento;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EquipamentoMapper {

    @Mapping(target = "empresa", ignore = true)
    Equipamento toEntity(EquipamentoRequest EquipamentoRequest);

    @Mapping(source = "empresa.id",  target = "empresaId")
    @Mapping(source = "empresa.nomeEmpresa", target = "nomeEmpresa")
    EquipamentoResponse toResponse(Equipamento equipamento);

    List<EquipamentoResponse> toResponseList(List<Equipamento> equipamentoList);

}
