package com.gcme.mvp.service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import com.gcme.mvp.repository.EquipamentoRepository;
import com.gcme.mvp.repository.ImagemRepository;
import com.gcme.mvp.util.ImageUtils;

import jakarta.transaction.Transactional;
import java.nio.file.Paths;
import java.nio.file.Path;

import com.gcme.mvp.dto.EquipamentoRequestDto;
import com.gcme.mvp.model.EquipamentoModel;
import com.gcme.mvp.model.imagens.DadosImagemEquip;


@Service
public class EquipamentoService {
    private final EquipamentoRepository equipamentoRep;
    private final ImagemRepository imagemRep;

    private final Path uploadDir = Paths.get("uploads");

    public EquipamentoService(EquipamentoRepository equipamento, ImagemRepository imagem){
        this.equipamentoRep = equipamento;
        this.imagemRep = imagem;
    }

    public List<EquipamentoModel> getAllEquipamentos(){
        Sort sort = Sort.by("nomeEquip");
        return equipamentoRep.findAll(sort);
    }

    public EquipamentoModel getById(long id){
        return equipamentoRep.findById(id).orElse(null);
    }

    @Transactional
    public EquipamentoModel create(EquipamentoRequestDto equipamentoDto, MultipartFile file)
     throws IOException{
        EquipamentoModel equip = new EquipamentoModel();
        equip.setNomeEquip(equipamentoDto.nomeEquip());
        equip.setDescricaoEquip(equipamentoDto.descricaoEquip());
        equip.setDataManutencao(equipamentoDto.dataManutencao());
        equip.setProximaManutencao(equipamentoDto.proximaManutencao());
        equip.setCodigoEquip(equipamentoDto.codigoEquip());
        equip.setMarcaEquip(equipamentoDto.marcaEquip());
        equip.setRangeTipo(equipamentoDto.rangeTipo());
        equip.setNumeroSerie(equipamentoDto.numeroSerie());
        equip.setModelo(equipamentoDto.modelo());

        DadosImagemEquip dadosImg = imagemRep.save(
        DadosImagemEquip.builder()
            .nome(file.getOriginalFilename())
            .tipo(file.getContentType())
            .dadosImagem(ImageUtils.compressImage(file.getBytes()))
            .build()
        );

        equip.setImagem(dadosImg);

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


    //imagens
    public String uploadImage(MultipartFile file) throws IOException{
        DadosImagemEquip dadosImg = imagemRep.save(DadosImagemEquip.builder()
        .nome(file.getOriginalFilename())
        .tipo(file.getContentType())
        .dadosImagem(ImageUtils.compressImage(file.getBytes())).build());
        if(dadosImg!=null){
            return "arquivo enviado com sucesso :"+file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName){
        Optional<DadosImagemEquip> dbImageData = imagemRep.findByNome(fileName);
        byte[] imagens=ImageUtils.decompressImage(dbImageData.get().getDadosImagem());
        return imagens;
    }
}
