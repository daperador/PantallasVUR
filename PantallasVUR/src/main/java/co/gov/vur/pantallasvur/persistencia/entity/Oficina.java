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
 *
 * @author Daniel
 */
@Entity
@Table(name = "CIRCULO_REGISTRAL")
@NamedQueries({
    @NamedQuery(name = "oficina.getAll", query = "select o from Oficina o order by o.nombre")
})
public class Oficina {
    
    @Id
    @Column(name = "ID_CIRCULO_REGISTRAL")
    private Long id;
    
    @Column(name = "CIRCULO")
    private String circulo;
    
    @Column(name = "DESCRIPCION_CIRCULO")
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCirculo() {
        return circulo;
    }

    public void setCirculo(String circulo) {
        this.circulo = circulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

                
}
