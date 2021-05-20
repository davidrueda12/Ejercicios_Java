/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1.modelos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "peliculas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peliculas.findAll", query = "SELECT p FROM Peliculas p")
    , @NamedQuery(name = "Peliculas.findByIdPeliculas", query = "SELECT p FROM Peliculas p WHERE p.idpeliculas = :idpeliculas")
    , @NamedQuery(name = "Peliculas.findByTitulo", query = "SELECT p FROM Peliculas p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Peliculas.findByAnio", query = "SELECT p FROM Peliculas p WHERE p.anio = :anio")})
public class Peliculas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpeliculas")
    private Integer idpeliculas;
    @Column(name = "Titulo")
    private String titulo;
    @Lob
    @Column(name = "Resumen")
    private String resumen;
    @Column(name = "Anio")
    private Long anio;
    //@OneToMany(mappedBy = "idPelicula")
    //private Collection<Transmisiones> transmisionesCollection;
    //@JoinColumn(name = "idDirectores", referencedColumnName = "idDirectores")
    //@ManyToOne(optional = false)
    private Integer iddirectores;

    public Integer getIddirectores() {
        return iddirectores;
    }

    public void setIddirectores(Integer iddirectores) {
        this.iddirectores = iddirectores;
    }

    public Peliculas() {
    }

    public Peliculas(String titulo, String resumen, Long anio, Integer iddirectores) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.anio = anio;
        this.iddirectores=iddirectores;
    }

    public Peliculas(Integer idPeliculas) {
        this.idpeliculas = idPeliculas;
    }

    public Integer getidpeliculas() {
        return idpeliculas;
    }

    public void setidpeliculas(Integer idPeliculas) {
        this.idpeliculas = idPeliculas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }


    public Integer idDirectores() {
        return iddirectores;
    }

    public void idDirectores(Integer idDirectores) {
        this.iddirectores = idDirectores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpeliculas != null ? idpeliculas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peliculas)) {
            return false;
        }
        Peliculas other = (Peliculas) object;
        if ((this.idpeliculas == null && other.idpeliculas != null) || (this.idpeliculas != null && !this.idpeliculas.equals(other.idpeliculas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Peliculas[" + "Titulo="+ titulo + ", Resumen=" + resumen + ", Año=" + anio + ", IdDirectores" + iddirectores + "]";
    }
    
}
