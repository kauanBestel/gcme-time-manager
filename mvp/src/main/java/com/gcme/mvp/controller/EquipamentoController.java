package com.gcme.mvp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcme.mvp.dto.EquipamentoRequestDto;
import com.gcme.mvp.model.EquipamentoModel;
import com.gcme.mvp.service.EquipamentoService;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService equipService;
    
    public EquipamentoController(EquipamentoService equipService){
        this.equipService = equipService;
    }

    @GetMapping
    public List<EquipamentoModel> getAll(){
        return equipService.getAllEquipamentos();
    }

    @PostMapping
    public ResponseEntity<EquipamentoModel> create(@RequestBody EquipamentoRequestDto equipDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(equipService.create(equipDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
            equipService.delete(id);
    }  
}
