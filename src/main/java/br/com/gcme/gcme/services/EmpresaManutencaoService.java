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

    public EmpresaManutencao create(EmpresaManutencao empresa){
       return empresaManutencaoRepository.save(empresa);
    }

    public EmpresaManutencao update(EmpresaManutencao empresa){
       return empresaManutencaoRepository.save(empresa);
    }

    public void delete(Long id){
        empresaManutencaoRepository.deleteById(id);
    }

    
}
