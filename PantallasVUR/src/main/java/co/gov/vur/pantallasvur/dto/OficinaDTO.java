/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.vur.pantallasvur.dto;

/**
 *
 * @author Daniel
 */
public class OficinaDTO {
    
    private Long id;
    private String circulo;
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
