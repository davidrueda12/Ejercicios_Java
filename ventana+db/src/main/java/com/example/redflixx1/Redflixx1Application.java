package com.example.redflixx1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Redflixx1Application {

    /*@Autowired
    UsuariosRepositorio usuariosRepositorio;
    PeliculasRepositorio peliculasRepositorio;*/
            
    public static void main(String[] args) throws Exception {
	//SpringApplication.run(Redflixx1Application.class, args);
       new Ventana().setVisible(true);
      
                
	}
    public static void iniciarSpring(){
        SpringApplication.run(Redflixx1Application.class);
    }
}
