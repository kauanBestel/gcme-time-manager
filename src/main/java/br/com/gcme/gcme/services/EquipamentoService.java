package br.com.gcme.gcme.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gcme.gcme.entity.Equipamento;
import br.com.gcme.gcme.repository.EquipamentoRepository;

@Service
public class EquipamentoService {
 
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(EquipamentoRepository equipamentoRepository){
        this.equipamentoRepository = equipamentoRepository;
    }

    public List<Equipamento> getAll(){
        Sort sort = Sort.by("nomeEquip");
        return equipamentoRepository.findAll(sort);
    }

    public Equipamento create(Equipamento equipamento){
       return equipamentoRepository.save(equipamento);
    }

    public Equipamento update(Equipamento equipamento){
       return equipamentoRepository.save(equipamento);
    }

    public List<Equipamento> delete(Long id){
        equipamentoRepository.deleteById(id);
        return getAll();
    }
}
