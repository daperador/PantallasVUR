/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.vur.pantallasvur.persistencia.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CORE_ROL")
public class Rol {
   
    @Id
    @Column(name = "ROLE_ID")
    private Long id;
    
    @Column(name = "DESCRIPTION")
    private String descripcion;

    @ManyToMany(cascade = {}, fetch = FetchType.LAZY)
    @JoinTable(name = "CORE_PARAMETROS_ROLE", joinColumns = {@JoinColumn(name = "ROL_ID")}, inverseJoinColumns = {@JoinColumn(name = "PARAMETRO_ID")})
    private List<ParametroBusqueda> parametrosBusqueda;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ParametroBusqueda> getParametrosBusqueda() {
        return parametrosBusqueda;
    }

    public void setParametrosBusqueda(List<ParametroBusqueda> parametrosBusqueda) {
        this.parametrosBusqueda = parametrosBusqueda;
    }
    
}
