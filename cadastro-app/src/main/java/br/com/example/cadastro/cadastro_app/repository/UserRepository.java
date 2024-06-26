package br.com.example.cadastro.cadastro_app.repository;


import br.com.example.cadastro.cadastro_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByLogin(String login);
}
