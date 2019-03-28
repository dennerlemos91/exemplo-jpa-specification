package br.com.specification.exemplospecification.controller;

import br.com.specification.exemplospecification.model.Categoria;
import br.com.specification.exemplospecification.repository.filtro.FiltroCategoria;
import br.com.specification.exemplospecification.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
public List<Categoria> findAll(FiltroCategoria filtroCategoria) {
    return categoriaService.findAll(filtroCategoria);
}


}
