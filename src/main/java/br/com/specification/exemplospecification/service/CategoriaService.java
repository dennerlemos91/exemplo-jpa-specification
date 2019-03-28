package br.com.specification.exemplospecification.service;

import br.com.specification.exemplospecification.model.Categoria;
import br.com.specification.exemplospecification.repository.CategoriaRepository;
import br.com.specification.exemplospecification.repository.filtro.FiltroCategoria;
import br.com.specification.exemplospecification.repository.specification.CategoriaSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll(FiltroCategoria filtroCategoria) {
        return categoriaRepository.findAll(
                Specification.where(CategoriaSpecification.descricao(filtroCategoria.getDescricao()))
                .and(Specification.where(CategoriaSpecification.id(1L)))
        );
    }
}
