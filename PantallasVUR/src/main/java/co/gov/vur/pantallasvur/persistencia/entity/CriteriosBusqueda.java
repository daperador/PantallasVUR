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
@Table(name = "CRITERIO_BUSQUEDA")
@NamedQueries({
    @NamedQuery(name = "criterioBusqueda.getAll", query = "select c from CriteriosBusqueda c")
})
public class CriteriosBusqueda {
    
    @Id
    @Column(name = "ID_CRITERIO")
    private Long id;
    
    @Column(name = "CRITERIO")
    private String criterio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }
    
    
}
