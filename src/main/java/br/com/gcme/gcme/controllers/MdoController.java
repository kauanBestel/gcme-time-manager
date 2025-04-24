package br.com.gcme.gcme.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gcme.gcme.entity.Mdo;
import br.com.gcme.gcme.services.MdoService;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping(name = "/mao-de-obra")
public class MdoController {
    
private MdoService mdoService;

    public MdoController(MdoService mdoService){
        this.mdoService = mdoService;
    }

    @PostMapping
    List<Mdo> create(@RequestBody Mdo mdo){
        return mdoService.create(mdo);
    }

    @GetMapping
    List<Mdo> list(){
     return mdoService.list();
    }
    @PutMapping
    List<Mdo> update(@RequestBody Mdo mdo){
        return mdoService.update(mdo);
    }

    @DeleteMapping("{id}")
    List<Mdo> delete(@RequestBody long id){
        return mdoService.delete(id);
    }
}
