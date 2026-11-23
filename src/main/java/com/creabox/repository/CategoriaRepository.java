
package com.creabox.repository;

import com.creabox.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Acceso a los datos de las categorías en MySQL
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
