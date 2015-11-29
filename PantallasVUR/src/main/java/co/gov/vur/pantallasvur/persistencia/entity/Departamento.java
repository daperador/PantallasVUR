/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package co.gov.vur.pantallasvur.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * vur
 * @author Daniel
 */
@Entity
@Table(name = "DEPARTAMENTO")
@NamedQueries({
    @NamedQuery(name = "departamento.getAll", query = "select d from Departamento d order by d.nombre")
})
public class Departamento {
    
    @Id
    @Column(name = "ID_DEPARTAMENTO")
    private String id;
    
    @Column(name = "NOMBRE")
    private String nombre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
