
package com.creabox.controller;

import com.creabox.model.Categoria;
import com.creabox.service.CategoriaService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // Consultar todas las categorías
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    // Buscar una categoría por ID
    @GetMapping("/{id}")
    public Categoria buscarCategoria(@PathVariable Integer id) {
        return categoriaService.buscarCategoria(id).orElse(null);
    }

    // Registrar una categoría
    @PostMapping
    public Categoria guardarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.guardarCategoria(categoria);
    }

    // Eliminar una categoría
    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable Integer id) {
        categoriaService.eliminarCategoria(id);
    }
}