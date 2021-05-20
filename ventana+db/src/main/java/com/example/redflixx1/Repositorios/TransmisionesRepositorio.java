/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1.Repositorios;

import com.example.redflixx1.modelos.Transmisiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface TransmisionesRepositorio extends JpaRepository<Transmisiones, Integer>{
    
}
