package br.com.example.cadastro.cadastro_app.dto;

import br.com.example.cadastro.cadastro_app.entity.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
