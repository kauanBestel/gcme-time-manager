package br.com.gcme.gcme.controller;

import java.net.http.HttpResponse.ResponseInfo;
import java.util.List;

import org.springframework.http.ResponseEntity;
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
import io.micrometer.core.ipc.http.HttpSender.Response;

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
        return equipamentoService.getAll();
    }

    @PostMapping
    public ResponseEntity<Equipamento> create(@RequestBody Equipamento equipamento) {
        Equipamento criado = equipamentoService.create(equipamento);
        return ResponseEntity.status(201).body(criado);
    }

    @PutMapping
    public ResponseEntity<Equipamento> update(@RequestBody Equipamento equipamento)
    {
        Equipamento atualizado = equipamentoService.update(equipamento);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        equipamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
