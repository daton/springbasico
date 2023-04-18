package educarvr.springbasico.config;

import educarvr.springbasico.dominio.Libro;
import educarvr.springbasico.dominio.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("educarvr.springbasico.dominio")
public class TiendaConfig {

    @Bean
    Libro  libroA(){
        Libro l1=new Libro("Los anunaki");

        l1.setNombre("Libro sobre los anunaqio");
        l1.setPrecio(400);
        return  l1;
    }
}
