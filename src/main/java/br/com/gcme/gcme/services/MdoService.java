package br.com.gcme.gcme.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.gcme.gcme.dto.MdoRequest;
import br.com.gcme.gcme.entity.Mdo;
import br.com.gcme.gcme.mapper.MdoMapper;
import br.com.gcme.gcme.repository.MdoRepository;

@Service
public class MdoService {

    private final MdoRepository mdoRepository;
    private final MdoMapper mdoMapper;


    public MdoService(MdoRepository mdoRepository, MdoMapper mdoMapper){
    this.mdoRepository = mdoRepository;
    this.mdoMapper = mdoMapper;
    }

    //LISTAR
    public List<Mdo> list(){
        Sort sort = Sort.by("nomeEmpresa").ascending();
        return mdoRepository.findAll(sort);
    }
    
    //CRIAR
    public List<Mdo> create(MdoRequest mdorequest)
    {
        Mdo mdo = mdoMapper.map(mdorequest);
        mdoRepository.save(mdo);
        return list();
    }

    //ATUALIZAR
    public List<Mdo> update(MdoRequest mdoRequest){
        Mdo mdo = mdoMapper.map(mdoRequest);
        mdoRepository.save(mdo);
        return list();
    }

    //DELETAR
    public List<Mdo> delete(long id){
        mdoRepository.deleteById(id);
        return list();
    }
}
