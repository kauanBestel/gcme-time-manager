package com.gcme.mvp.service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import com.gcme.mvp.repository.EquipamentoRepository;

import jakarta.transaction.Transactional;
import java.nio.file.Paths;
import java.nio.file.Path;

import com.gcme.mvp.dto.EquipamentoRequestDto;
import com.gcme.mvp.model.EquipamentoModel;


@Service
public class EquipamentoService {
    private final EquipamentoRepository equipamentoRep;
    private final Path uploadDir = Paths.get("uploads");

    public EquipamentoService(EquipamentoRepository equipamento){
        this.equipamentoRep = equipamento;
    }

    public List<EquipamentoModel> getAllEquipamentos(){
        Sort sort = Sort.by("nomeEquip");
        return equipamentoRep.findAll(sort);
    }

    public EquipamentoModel getById(long id){
        return equipamentoRep.findById(id).orElse(null);
    }

    @Transactional
    public EquipamentoModel create(EquipamentoRequestDto equipamentoDto){
        EquipamentoModel equip = new EquipamentoModel();
        equip.setNomeEquip(equipamentoDto.nomeEquip());
        equip.setDescricaoEquip(equipamentoDto.descricaoEquip());
        equip.setDataManutencao(equipamentoDto.dataManutencao());
        equip.setProximaManutencao(equipamentoDto.proximaManutencao());

       return equipamentoRep.save(equip);
    }

    public EquipamentoModel update(EquipamentoModel equipamento){
       return equipamentoRep.save(equipamento);
    }

    public EquipamentoModel delete(Long id){
        EquipamentoModel equipamento = equipamentoRep.findById(id).orElse(null);
        if(equipamento != null){
            equipamentoRep.deleteById(id);
        }
         return equipamento;
    }

    public String salvarImagem(MultipartFile file) throws IOException{

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        if(fileName.contains("..")){
              throw new RuntimeException("Erro ao armazenar arquivo");
        }

        if (!Files.exists(uploadDir)) {
            Files.createDirectories(uploadDir);
        }

        Path targetLocation = uploadDir.resolve(fileName);
        file.transferTo(targetLocation.toFile());

        return "/uploads" + fileName;
    }
}
