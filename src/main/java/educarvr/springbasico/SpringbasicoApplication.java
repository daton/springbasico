package educarvr.springbasico;

import educarvr.springbasico.dominio.Libro;
import educarvr.springbasico.dominio.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbasicoApplication implements CommandLineRunner {
@Autowired
Libro libroA;
	public static void main(String[] args) {
		SpringApplication.run(SpringbasicoApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(libroA.getTitulo());
	}
}
