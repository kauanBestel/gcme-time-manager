package br.com.gcme.gcme.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gcme.gcme.entity.Equipamento;
import br.com.gcme.gcme.repository.EquipamentoRepository;

@Service
public class EquipamentoService {

    private EquipamentoRepository equipamentoRepository;

    public EquipamentoService(EquipamentoRepository equipamentoRepository){
        this.equipamentoRepository = equipamentoRepository;
    }
 
    public List<Equipamento> list(){
        Sort sort = Sort.by("tempo_manutencao");
        return equipamentoRepository.findAll(sort);
    }

    public List<Equipamento> create(Equipamento equipamento){
        equipamentoRepository.save(equipamento);
        return list();
    }

    public List<Equipamento> update(Equipamento equipamento){
        equipamentoRepository.save(equipamento);
        return list();
    }

    public List<Equipamento> delete(Long id){
        equipamentoRepository.deleteById(id);
        return list();
    }
}
