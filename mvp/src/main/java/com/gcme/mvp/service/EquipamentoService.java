package com.gcme.mvp.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gcme.mvp.repository.EquipamentoRepository;

import jakarta.transaction.Transactional;

import com.gcme.mvp.dto.EquipamentoRequestDto;
import com.gcme.mvp.model.EquipamentoModel;


@Service
public class EquipamentoService {
    private final EquipamentoRepository equipamentoRep;

    public EquipamentoService(EquipamentoRepository equipamento){
        this.equipamentoRep = equipamento;
    }

    public List<EquipamentoModel> getAllEquipamentos(){
        Sort sort = Sort.by("nomeEquip");
        return equipamentoRep.findAll(sort);
    }

    @Transactional
    public EquipamentoModel create(EquipamentoRequestDto equipamentoDto){
        EquipamentoModel equip = new EquipamentoModel();
        equip.setNomeEquip(equipamentoDto.nomeEquip());
        equip.setDescricaoEquip(equipamentoDto.descricaoEquip());
        equip.setDataManutencao(equipamentoDto.dataManutencao());
        equip.setProximaManutencao(equipamentoDto.proximaManutencao());

       return equipamentoRep.save(equip);
    }

    public EquipamentoModel update(EquipamentoModel equipamento){
       return equipamentoRep.save(equipamento);
    }

    public EquipamentoModel delete(Long id){
        EquipamentoModel equipamento = equipamentoRep.findById(id).orElse(null);
        if(equipamento != null){
            equipamentoRep.deleteById(id);
        }
         return equipamento;
    }
}
