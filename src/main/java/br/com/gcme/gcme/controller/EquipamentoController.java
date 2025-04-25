package br.com.gcme.gcme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gcme.gcme.dto.EquipamentoRequest;
import br.com.gcme.gcme.entity.Equipamento;
import br.com.gcme.gcme.services.EquipamentoService;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    
private EquipamentoService equipamentoService;

public EquipamentoController(EquipamentoService equipamentoService){
    this.equipamentoService = equipamentoService;
}

    @GetMapping
    List<Equipamento> list(){
        return equipamentoService.list();
    }

    @PostMapping
    List<Equipamento> create(@RequestBody EquipamentoRequest equipamentoRequest) {
        return equipamentoService.create(equipamentoRequest);
    }

    @PutMapping
    List<Equipamento> update(@RequestBody EquipamentoRequest equipamentoeRequest)
    {
        return equipamentoService.update(equipamentoeRequest);
    }

    @DeleteMapping("{id}")
    List<Equipamento> delete(@PathVariable Long id){
        return equipamentoService.delete(id);
    }

}
