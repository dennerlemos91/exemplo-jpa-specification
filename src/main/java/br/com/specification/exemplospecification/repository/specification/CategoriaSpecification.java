package br.com.specification.exemplospecification.repository.specification;

import br.com.specification.exemplospecification.model.Categoria;
import org.springframework.data.jpa.domain.Specification;

public class CategoriaSpecification {

    public static Specification<Categoria> descricao(String descricao) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.like(root.get("descricao"), "%"+descricao+"%");
    }

    public static Specification<Categoria> id(Long id) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("id"), id);
    }
}
