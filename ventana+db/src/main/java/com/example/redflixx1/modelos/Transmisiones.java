/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1.modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "transmisiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transmisiones.findAll", query = "SELECT t FROM Transmisiones t")
    , @NamedQuery(name = "Transmisiones.findByIdTransmisiones", query = "SELECT t FROM Transmisiones t WHERE t.idTransmisiones = :idTransmisiones")
    , @NamedQuery(name = "Transmisiones.findByTiempo", query = "SELECT t FROM Transmisiones t WHERE t.tiempo = :tiempo")})
public class Transmisiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTransmisiones")
    private Integer idTransmisiones;
    @Column(name = "Tiempo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempo;
   // @JoinColumn(name = "idPelicula", referencedColumnName = "idPeliculas")
    //@ManyToOne
    private Peliculas idPelicula;
    private Series idSerie;
    //@JoinColumn(name = "Usuarios_Alias", referencedColumnName = "Alias")
    //@ManyToOne(optional = false)
    private Usuarios usuariosAlias;

    public Transmisiones() {
    }

    public Transmisiones(Integer idTransmisiones) {
        this.idTransmisiones = idTransmisiones;
    }

    public Integer getIdTransmisiones() {
        return idTransmisiones;
    }

    public void setIdTransmisiones(Integer idTransmisiones) {
        this.idTransmisiones = idTransmisiones;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public Peliculas getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Peliculas idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Series getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Series idSerie) {
        this.idSerie = idSerie;
    }

    public Usuarios getUsuariosAlias() {
        return usuariosAlias;
    }

    public void setUsuariosAlias(Usuarios usuariosAlias) {
        this.usuariosAlias = usuariosAlias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransmisiones != null ? idTransmisiones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transmisiones)) {
            return false;
        }
        Transmisiones other = (Transmisiones) object;
        if ((this.idTransmisiones == null && other.idTransmisiones != null) || (this.idTransmisiones != null && !this.idTransmisiones.equals(other.idTransmisiones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.redflix1.Transmisiones[ idTransmisiones=" + idTransmisiones + " ]";
    }
    
}
