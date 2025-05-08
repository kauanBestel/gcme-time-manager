package br.com.gcme.gcme.services;

import java.util.List;
import br.com.gcme.gcme.repository.EquipamentoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gcme.gcme.entity.EmpresaManutencao;
import br.com.gcme.gcme.repository.EmpresaManutencaoRepository;

@Service
public class EmpresaManutencaoService {
    
    private final EmpresaManutencaoRepository empresaManutencaoRepository;

    public EmpresaManutencaoService(EmpresaManutencaoRepository empresaManutencaoRepository, EquipamentoRepository equipamentoRepository){
        this.empresaManutencaoRepository = empresaManutencaoRepository;
    }

    public List<EmpresaManutencao> getAll(){
        Sort sort = Sort.by("nomeEmpresa");
        return empresaManutencaoRepository.findAll(sort);
    }

    public List<EmpresaManutencao> create(EmpresaManutencao empresaManutencao){
        empresaManutencaoRepository.save(empresaManutencao);
        return getAll();
    }

    public List<EmpresaManutencao> update(EmpresaManutencao empresaManutencao){
        empresaManutencaoRepository.save(empresaManutencao);
        return getAll();
    }

    public List<EmpresaManutencao> delete(Long id){
        empresaManutencaoRepository.deleteById(id);
        return getAll();
    }

    
}
