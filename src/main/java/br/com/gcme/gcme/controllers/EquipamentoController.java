package br.com.gcme.gcme.controllers;

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
    @PostMapping
    List<Equipamento> create(@RequestBody Equipamento equipamento) {
        return equipamentoService.create(equipamento);
    }

    @GetMapping
    List<Equipamento> list(){
        return equipamentoService.list();
    }

    @PutMapping
    List<Equipamento> update(@RequestBody Equipamento equipamento)
    {
        return equipamentoService.update(equipamento);
    }

    @DeleteMapping("{id}")
    List<Equipamento> delete(@PathVariable Long id){
        return equipamentoService.delete(id);
    }

}
