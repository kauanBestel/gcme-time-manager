package br.com.gcme.gcme.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import br.com.gcme.gcme.dto.MdoRequest;
import br.com.gcme.gcme.dto.MdoResponse;
import br.com.gcme.gcme.entity.Mdo;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MdoMapper {

    // de DTO de entrada (POST/PUT) para entity
    Mdo toEntity(MdoRequest mdorequest);


    // de entidade para DTO de saida (GET)
    MdoResponse toResponse(Mdo mdo);

    // lista de entidades para lista de DTO de saida
    List<MdoResponse> toResponseList(List<Mdo> mdoList);
    
   
}
