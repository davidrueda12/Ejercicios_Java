/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1.modelos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "directores")
@XmlRootElement

public class Directores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddirectores")
    private Integer iddirectores;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Nacionalidad")
    private String nacionalidad;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idDirectores")
    //private Collection<Peliculas> peliculasCollection;

    public Directores() {
    }


    public Directores(Integer iddirectores, String nombre) {
        this.iddirectores=iddirectores;
        this.nombre=nombre;
    }

    public Integer getiddirectores() {
        return iddirectores;
    }

    public void setiddirectores(Integer idDirectores) {
        this.iddirectores = idDirectores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
@Override
    public int hashCode() {
        int hash = 0;
        hash += (iddirectores != null ? iddirectores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Directores)) {
            return false;
        }
        Directores other = (Directores) object;
        if ((this.iddirectores == null && other.iddirectores != null) || (this.iddirectores != null && !this.iddirectores.equals(other.iddirectores))) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "[ idDirectores="+ iddirectores + "]";
    }

    public void setidDirectores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Directores getDirectores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
