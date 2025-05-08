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
import br.com.gcme.gcme.services.EmpresaManutencaoService;



@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/mao-de-obra")
public class EmpresaManutencaoController {
    
private EmpresaManutencaoService empresaManutencaoService;

    public EmpresaManutencaoController(EmpresaManutencaoService empresaManutencaoService){
        this.empresaManutencaoService = empresaManutencaoService;
    }

    //GET
    @GetMapping
    List<EmpresaManutencao> list(){
     return empresaManutencaoService.getAll();
    }

    //POST
    @PostMapping
    List<EmpresaManutencao> create(@RequestBody EmpresaManutencao empresaManutencaoRequestDto){
        return empresaManutencaoService.create(empresaManutencaoRequestDto);
    }
    
    //UPDATE
    @PutMapping
    List<EmpresaManutencao> update(@RequestBody EmpresaManutencao empresaManutencaoRequestDto){
        return empresaManutencaoService.update(empresaManutencaoRequestDto);
    }

    //DELETE
    @DeleteMapping("{id}")
    List<EmpresaManutencao> delete(@PathVariable long id){
        return empresaManutencaoService.delete(id);
    }
}
