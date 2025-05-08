package br.com.gcme.gcme.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import br.com.gcme.gcme.dto.EmpresaManutencaoRequest;
import br.com.gcme.gcme.dto.EmpresaaMantencaoResponse;
import br.com.gcme.gcme.entity.EmpresaManutencao;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmpresaManutencaoMapper {

    // de DTO de entrada (POST/PUT) para entity
    @Mapping(target = "equipamentos", ignore = true)
    @Mapping(target="id", ignore=true)
    EmpresaManutencao toEntity(EmpresaManutencaoRequest mdorequest);


    // de entidade para DTO de saida (GET)
    EmpresaaMantencaoResponse toResponse(EmpresaManutencao mdo);

    // lista de entidades para lista de DTO de saida
    List<EmpresaaMantencaoResponse> toResponseList(List<EmpresaManutencao> mdoList);
    
   
}
