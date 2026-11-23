
package com.creabox;

// Importa la clase encargada de iniciar la aplicación Spring Boot.
import org.springframework.boot.SpringApplication;

// Importa la anotación que configura automáticamente Spring Boot.
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Clase principal del proyecto CREA BOX.
 *
 * Esta clase permite iniciar la aplicación web y preparar
 * el entorno de Spring Boot para ejecutar sus funcionalidades.
 */
@SpringBootApplication
public class CreaBoxApplication {

    /*
     * Método principal del programa.
     * Es el punto de entrada cuando se ejecuta la aplicación Java.
     *
     * SpringApplication.run() inicia Spring Boot y configura
     * los componentes necesarios para poner en funcionamiento
     * el servidor web.
     */
    public static void main(String[] args) {

        // Inicia la aplicación CREA BOX.
        SpringApplication.run(CreaBoxApplication.class, args);
    }

}
