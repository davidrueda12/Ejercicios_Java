/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1.modelos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "series")

public class Series implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idSeries")
    Integer idSeries;
    @Column(name = "Titulo")
    String titulo;
    @Column(name = "NumeroTemporadas")
    Short numeroTemporadas;
    @Column(name = "NumeroEpisodios")
    Short numeroEpisodios;
    

    public Series() {
    }

    public Series(Integer idSeries) {
        this.idSeries = idSeries;
    }

    public Integer getIdSeries() {
        return idSeries;
    }

    public void setIdSeries(Integer idSeries) {
        this.idSeries = idSeries;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Short getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Short numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public Short getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(Short numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeries != null ? idSeries.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Series)) {
            return false;
        }
        Series other = (Series) object;
        if ((this.idSeries == null && other.idSeries != null) || (this.idSeries != null && !this.idSeries.equals(other.idSeries))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.redflix1.Series[ idSeries=" + idSeries + " ]";
    }
    
}
