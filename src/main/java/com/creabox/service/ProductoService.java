
package com.creabox.service;

import com.creabox.model.Producto;
import com.creabox.repository.ProductoRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    // Constructor para conectar con el repositorio
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Consultar todos los productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Buscar un producto por su identificador
    public Optional<Producto> buscarProducto(Integer id) {
        return productoRepository.findById(id);
    }

    // Registrar o actualizar un producto
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Eliminar un producto
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
