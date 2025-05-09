package br.com.gcme.gcme.mapper;

import br.com.gcme.gcme.dto.EquipamentoRequestDto;
import br.com.gcme.gcme.entity.EmpresaManutencao;
import br.com.gcme.gcme.entity.Equipamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EquipamentoMapper {

   @Mapping(target = "empresaManutencao", source = "empresaManutencaoId")
    Equipamento toEntity(EquipamentoRequestDto dto);

    default EmpresaManutencao fromId(Long id){
        if(id == null){
            return null;
        }
        return new EmpresaManutencao();
    }

}
