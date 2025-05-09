package br.com.gcme.gcme.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
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
@RequestMapping("/empresa-de-manutencao")
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
    public ResponseEntity<EmpresaManutencao> create(@RequestBody EmpresaManutencao empresa){
        EmpresaManutencao criada = empresaManutencaoService.create(empresa);
        return ResponseEntity.status(201).body(criada); //HTTP 201  CREATED
    }
    
    //UPDATE
    @PutMapping
    public ResponseEntity<EmpresaManutencao> update(@RequestBody EmpresaManutencao empresa){
        EmpresaManutencao atualizada = empresaManutencaoService.update(empresa);
        return ResponseEntity.ok(atualizada);//HTTP 200 OK
    }

    //DELETE
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        empresaManutencaoService.delete(id);
        return ResponseEntity.noContent().build(); //HTTP 204 no content
    }
}
