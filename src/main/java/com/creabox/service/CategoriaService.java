
package com.creabox.service;

import com.creabox.model.Categoria;
import com.creabox.repository.CategoriaRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    // Constructor para conectar con el repositorio
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    // Consultar todas las categorías
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    // Buscar una categoría por su ID
    public Optional<Categoria> buscarCategoria(Integer id) {
        return categoriaRepository.findById(id);
    }

    // Registrar o actualizar una categoría
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Eliminar una categoría
    public void eliminarCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
