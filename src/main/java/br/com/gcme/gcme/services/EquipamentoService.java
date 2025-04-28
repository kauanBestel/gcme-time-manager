package br.com.gcme.gcme.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gcme.gcme.dto.EquipamentoRequest;
import br.com.gcme.gcme.entity.Equipamento;
import br.com.gcme.gcme.mapper.EquipamentoMapper;
import br.com.gcme.gcme.repository.EquipamentoRepository;

@Service
public class EquipamentoService {

    private final EquipamentoRepository equipamentoRepository;
    private final EquipamentoMapper equipamentoMapper;

    public EquipamentoService(EquipamentoRepository equipamentoRepository, EquipamentoMapper equipamentoMapper){
        this.equipamentoRepository = equipamentoRepository;
        this.equipamentoMapper = equipamentoMapper;
    }
 
    public List<Equipamento> list(){
        Sort sort = Sort.by("tempo_manutencao");
        return equipamentoRepository.findAll(sort);
    }

    public List<Equipamento> create(EquipamentoRequest equipamentoRequest){

        Equipamento equipamento = equipamentoMapper.toEntity(equipamentoRequest);
        equipamentoRepository.save(equipamento);
        return list();
    }

    public List<Equipamento> update(EquipamentoRequest equipamentoRequest){
        
        Equipamento equipamento = equipamentoMapper.toEntity(equipamentoRequest);
        equipamentoRepository.save(equipamento);
        return list();
    }

    public List<Equipamento> delete(Long id){
        equipamentoRepository.deleteById(id);
        return list();
    }
}
