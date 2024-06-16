package br.com.login_auth_api.domain.product;


public record ProductRequestDTO(
        String name,
        Integer price
) {
}