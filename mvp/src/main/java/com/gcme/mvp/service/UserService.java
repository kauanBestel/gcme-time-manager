package com.gcme.mvp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gcme.mvp.dto.UserRequestDto;
import com.gcme.mvp.model.UserModel;
import com.gcme.mvp.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserModel> getAll(){
        return userRepository.findAll();
    }

    @Transactional
    public UserModel create(UserRequestDto userDto){
       
        UserModel user = new UserModel();
        user.setNome(userDto.nome());
        user.setFoto(userDto.foto());
        user.setSenha(userDto.senha());
        user.setConfirmarSenha(userDto.confirmarSenha());

        return userRepository.save(user);
    }

    public UserModel update(UserModel userModel){
        return userRepository.save(userModel);
    }

    public void delete(long id){
        userRepository.deleteById(id);
    }
}
