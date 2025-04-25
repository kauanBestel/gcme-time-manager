package br.com.gcme.gcme.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import br.com.gcme.gcme.dto.MdoRequest;
import br.com.gcme.gcme.dto.MdoResponse;
import br.com.gcme.gcme.entity.Mdo;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MdoMapper {

    Mdo map(MdoRequest mdoRequest, MdoResponse mdoResponse);
    Mdo map(MdoRequest mdorequest);
   
}
