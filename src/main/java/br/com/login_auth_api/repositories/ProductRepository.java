package br.com.login_auth_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.login_auth_api.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}