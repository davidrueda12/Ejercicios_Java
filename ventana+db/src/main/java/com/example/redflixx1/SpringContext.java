/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1;

import com.example.redflixx1.Repositorios.PeliculasRepositorio;
import java.util.Objects;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario
 */
@Component
public class SpringContext implements ApplicationContextAware {
    
    private static ApplicationContext context;
    
    /*public static <T extends Objects> T getBean(Class<T> beanClass){
        return context.getBean(beanClass);}*/

    static PeliculasRepositorio getBean(Class<PeliculasRepositorio> beanClass) {
        return context.getBean(beanClass);
    }
    
    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        SpringContext.context = ac ;
    }
     
}
