
package com.creabox.controller;

import com.creabox.model.Producto;
import com.creabox.service.ProductoService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Consultar todos los productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    // Consultar un producto por ID
    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable Integer id) {
        return productoService.buscarProducto(id).orElse(null);
    }

    // Registrar un producto
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Integer id) {
        productoService.eliminarProducto(id);
    }
}
