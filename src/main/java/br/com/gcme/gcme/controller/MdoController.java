package br.com.gcme.gcme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gcme.gcme.entity.EmpresaManutencao;
import br.com.gcme.gcme.services.MdoService;
import br.com.gcme.gcme.dto.EmpresaManutencaoRequest;


@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/mao-de-obra")
public class MdoController {
    
private MdoService mdoService;

    public MdoController(MdoService mdoService){
        this.mdoService = mdoService;
    }

    //GET
    @GetMapping
    List<EmpresaManutencao> list(){
     return mdoService.list();
    }

    //POST
    @PostMapping
    List<EmpresaManutencao> create(@RequestBody EmpresaManutencaoRequest mdoRequest){
        return mdoService.create(mdoRequest);
    }
    
    //UPDATE
    @PutMapping
    List<EmpresaManutencao> update(@RequestBody EmpresaManutencaoRequest mdoRequest){
        return mdoService.update(mdoRequest);
    }

    //DELETE
    @DeleteMapping("{id}")
    List<EmpresaManutencao> delete(@PathVariable long id){
        return mdoService.delete(id);
    }
}
