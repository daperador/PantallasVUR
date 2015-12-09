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
public class ConsultaIndicesDTO {
    
    private ParametroBusquedaDTO tipoBusqueda;
    //matricula
    private OficinaDTO circuloRegistral;
    private String matricula;
    //documento
    private TipoDocumentoDTO tipoDocumento;
    private String numeroDocumento;
    //referencia catastral
    private String referenciaCatastral;
    //cedula catastral
    private String cedulaCatastral;
    //datos propietario natural
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    //propietario juridico
    private String razonSocial;

    public ParametroBusquedaDTO getTipoBusqueda() {
        return tipoBusqueda;
    }

    public void setTipoBusqueda(ParametroBusquedaDTO tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
    }

    public OficinaDTO getCirculoRegistral() {
        return circuloRegistral;
    }

    public void setCirculoRegistral(OficinaDTO circuloRegistral) {
        this.circuloRegistral = circuloRegistral;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoDocumentoDTO getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getReferenciaCatastral() {
        return referenciaCatastral;
    }

    public void setReferenciaCatastral(String referenciaCatastral) {
        this.referenciaCatastral = referenciaCatastral;
    }

    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    public void setCedulaCatastral(String cedulaCatastral) {
        this.cedulaCatastral = cedulaCatastral;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
    
}
