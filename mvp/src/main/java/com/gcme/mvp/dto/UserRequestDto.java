package com.gcme.mvp.dto;

public record UserRequestDto(
     String nome,
     String foto,
     String senha,
     String confirmarSenha
){}
