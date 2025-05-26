package com.gcme.mvp.controller;

import java.io.IOException;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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

    @GetMapping("/{id}")
    public EquipamentoModel getById(@PathVariable long id){
        return equipService.getById(id);
    }
    
    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<EquipamentoModel> createWithImage(
        @RequestParam("equipamento") String equipamentoJson,
        @RequestPart("imagem") MultipartFile imagem)
     throws IOException{

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        EquipamentoRequestDto equipDto = mapper.readValue(equipamentoJson,EquipamentoRequestDto.class);

        EquipamentoModel equipamento = equipService.create(equipDto, imagem);

        return ResponseEntity.status(HttpStatus.CREATED).body(equipamento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
            equipService.delete(id);
    }
}
