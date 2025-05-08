package br.com.gcme.gcme.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import br.com.gcme.gcme.dto.EmpresaManutencaoRequest;
import br.com.gcme.gcme.entity.EmpresaManutencao;
import br.com.gcme.gcme.mapper.EmpresaManutencaoMapper;
import br.com.gcme.gcme.repository.MdoRepository;

@Service
public class MdoService {

    private final MdoRepository mdoRepository;
    private final EmpresaManutencaoMapper mdoMapper;


    public MdoService(MdoRepository mdoRepository, EmpresaManutencaoMapper mdoMapper){
    this.mdoRepository = mdoRepository;
    this.mdoMapper = mdoMapper;
    }

    //LISTAR
    public List<EmpresaManutencao> list(){
        Sort sort = Sort.by("nomeEmpresa").ascending();
        return mdoRepository.findAll(sort);
    }
    
    //CRIAR
    public List<EmpresaManutencao> create(EmpresaManutencaoRequest mdorequest)
    {
        EmpresaManutencao mdo = mdoMapper.toEntity(mdorequest);
        mdoRepository.save(mdo);
        return list();
    }

    //ATUALIZAR
    public List<EmpresaManutencao> update(EmpresaManutencaoRequest mdoRequest){
        EmpresaManutencao mdo = mdoMapper.toEntity(mdoRequest);
        mdoRepository.save(mdo);
        return list();
    }

    //DELETAR
    public List<EmpresaManutencao> delete(long id){
        mdoRepository.deleteById(id);
        return list();
    }
}
