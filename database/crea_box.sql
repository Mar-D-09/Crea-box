

-- ============================================
-- BASE DE DATOS CREA BOX
-- ============================================

CREATE DATABASE IF NOT EXISTS crea_box
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE crea_box;

-- ============================================
-- TABLA CATEGORIAS
-- ============================================

CREATE TABLE IF NOT EXISTS categorias (
    id_categoria INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    PRIMARY KEY (id_categoria),
    UNIQUE KEY uk_categorias_nombre (nombre)
) ENGINE=InnoDB;

-- ============================================
-- TABLA PRODUCTOS
-- ============================================

CREATE TABLE IF NOT EXISTS productos (
    id_producto INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    id_categoria INT NOT NULL,
    precio DECIMAL(19,2) NOT NULL,
    existencias INT NOT NULL,
    PRIMARY KEY (id_producto),
    KEY idx_productos_id_categoria (id_categoria),
    CONSTRAINT fk_productos_categorias
        FOREIGN KEY (id_categoria)
        REFERENCES categorias (id_categoria)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
) ENGINE=InnoDB;

-- ============================================
-- CONSULTA DE PRODUCTOS
-- ============================================

SELECT
    p.id_producto,
    p.nombre,
    c.nombre AS categoria,
    p.precio,
    p.existencias
FROM productos p
INNER JOIN categorias c
    ON p.id_categoria = c.id_categoria
ORDER BY p.id_producto;
