/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.vur.pantallasvur.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * VUR
 * @author Daniel
 */
@Entity
@Table(name = "MUNICIPIO")
@NamedQueries({
    @NamedQuery(name = "municipio.getAll", query = "select m from Municipio m where m.vur=1 order by m.nombre"),
    @NamedQuery(name = "municipio.getByDepartamento", query = "select m from Municipio m where m.departamento.id=:departamento and m.vur=1 order by m.nombre")
})
public class Municipio {
    
    @Id
    @Column(name = "ID_MUNICIPIO")
    private Long id;
    
    @Column(name = "COD_MUNICIPIO")
    private String codigo;
    
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_DEPARTAMENTO")
    private Departamento departamento;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "MUNICIPIO_VUR")
    private String vur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVur() {
        return vur;
    }

    public void setVur(String vur) {
        this.vur = vur;
    }
    
    
}
