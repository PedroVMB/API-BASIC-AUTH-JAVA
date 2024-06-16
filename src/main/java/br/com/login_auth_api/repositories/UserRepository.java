package br.com.login_auth_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.login_auth_api.domain.user.User;

public interface UserRepository extends JpaRepository<User, String>{
    UserDetails findByLogin(String login);
}
