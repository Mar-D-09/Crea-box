
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