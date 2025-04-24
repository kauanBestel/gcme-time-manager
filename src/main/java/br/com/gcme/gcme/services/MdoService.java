package br.com.gcme.gcme.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gcme.gcme.entity.Mdo;
import br.com.gcme.gcme.repository.MdoRepository;

@Service
public class MdoService {

    private MdoRepository mdoRepository;

    public MdoService(MdoRepository mdoRepository){
    this.mdoRepository = mdoRepository;
    }

    public List<Mdo> list(){
        Sort sort = Sort.by("nomeEmpresa").ascending();
        return mdoRepository.findAll(sort);
    }
    
    public List<Mdo> create(Mdo mdo)
    {
        mdoRepository.save(mdo);
        return list();
    }

    public List<Mdo> update(Mdo mdo){
        mdoRepository.save(mdo);
        return list();
    }

    public List<Mdo> delete(long id){
        mdoRepository.deleteById(id);
        return list();
    }
}
