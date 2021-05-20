/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1;

import com.example.redflixx1.Repositorios.DirectoresRepositorio;
import com.example.redflixx1.Repositorios.PeliculasRepositorio;
import com.example.redflixx1.Repositorios.UsuariosRepositorio;
import com.example.redflixx1.modelos.Directores;
import com.example.redflixx1.modelos.Peliculas;
import com.example.redflixx1.modelos.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario
 */
@Component
public class MyRunner implements CommandLineRunner {
    
    @Autowired
    UsuariosRepositorio usuariosRepositorio;
    @Autowired
    PeliculasRepositorio peliculasRepositorio;
    @Autowired
    DirectoresRepositorio directorRepositorio;
    
   
    @Override
    public void run(String... args) throws Exception {
        
        /*Usuarios usuario = new Usuarios();
        usuario.setAlias("Sparrow");
        usuario.setNombres("Johnny Depp");
        usuariosRepositorio.save(usuario);
        System.out.println("Se registro correctamente el usuario");*/
        
        /*Directores guason = new Directores();
        guason.setIdDirectores(106);
        guason.setNombre("Todd Phillips");
        directorRepositorio.save(guason);
        System.out.println("Se creo el director");
        Integer iddirector = directorRepositorio.findById(106).get().getiddirectores();
        System.out.println(iddirector);
        Peliculas pelicula = new Peliculas(
        "Guasón",
        "Pelicula de suspenso basada en el personaje de DC Comics Joker que se remonta a los orígenes del personaje con profundo análisis social.",
        2019,
        iddirector
        );
        
        peliculasRepositorio.save(pelicula);
        System.out.println("Se agrego la pelicula correctamente");*/
    }
}

