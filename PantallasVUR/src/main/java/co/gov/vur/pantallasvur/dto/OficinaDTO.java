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
    
    private Long idCirculo;
    private String circulo;
    private String nombreOficina;

    public Long getIdCirculo() {
        return idCirculo;
    }

    public void setIdCirculo(Long idCirculo) {
        this.idCirculo = idCirculo;
    }

    public String getCirculo() {
        return circulo;
    }

    public void setCirculo(String circulo) {
        this.circulo = circulo;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }
    
}
