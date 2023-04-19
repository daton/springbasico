package educarvr.springbasico;

import educarvr.springbasico.config.TiendaConfig;
import educarvr.springbasico.dominio.Libro;
import educarvr.springbasico.dominio.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbasicoApplication implements CommandLineRunner {
@Autowired
Libro libroA;
	public static void main(String[] args) {
		SpringApplication.run(SpringbasicoApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
/*
Normalmente se accede a los beans por medio de la clase
AnnotatioConfigApplicationContext
 */
	ApplicationContext ctx= new AnnotationConfigApplicationContext(TiendaConfig.class);
	Libro libro=  ctx.getBean("libroA", Libro.class);
		System.out.println(libroA.getTitulo());
		System.out.println(libro.getTitulo());
	}
}
