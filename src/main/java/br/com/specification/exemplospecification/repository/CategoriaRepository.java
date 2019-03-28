package br.com.specification.exemplospecification.repository;

import br.com.specification.exemplospecification.model.Categoria;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>, JpaSpecificationExecutor<Categoria> {


    @Query("SELECT c FROM Categoria c WHERE c.id = 1")
    List<Categoria> buscarTodos(Specification<Categoria> specification);
}
