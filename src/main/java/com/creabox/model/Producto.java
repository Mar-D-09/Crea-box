
package com.creabox.model;

// Importaciones de JPA para conectar Java con MySQL
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

// Importación para manejar precios con decimales
import java.math.BigDecimal;

// Indica que esta clase representa una tabla de la base de datos
@Entity
@Table(name = "productos")
public class Producto {

    // Identificador único del producto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    // Nombre del kit creativo
    @Column(name = "nombre", nullable = false)
    private String nombre;

    // Identificador de la categoría a la que pertenece
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    // Precio de venta del producto
    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    // Cantidad de unidades disponibles
    @Column(name = "existencias", nullable = false)
    private Integer existencias;

    // Constructor vacío requerido por JPA
    public Producto() {
    }

    // Obtener el identificador
    public Integer getIdProducto() {
        return idProducto;
    }

    // Asignar el identificador
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    // Obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Asignar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtener la categoría
    public Integer getIdCategoria() {
        return idCategoria;
    }

    // Asignar la categoría
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    // Obtener el precio
    public BigDecimal getPrecio() {
        return precio;
    }

    // Asignar el precio
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    // Obtener las existencias
    public Integer getExistencias() {
        return existencias;
    }

    // Asignar las existencias
    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }
}
