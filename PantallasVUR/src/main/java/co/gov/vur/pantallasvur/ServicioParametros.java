/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.vur.pantallasvur;

import co.gov.vur.pantallasvur.dto.CriteriosBusquedaDTO;
import co.gov.vur.pantallasvur.dto.DepartamentoDTO;
import co.gov.vur.pantallasvur.dto.MunicipioDTO;
import co.gov.vur.pantallasvur.dto.OficinaDTO;
import co.gov.vur.pantallasvur.dto.ParametroBusquedaDTO;
import co.gov.vur.pantallasvur.dto.TipoDocumentoDTO;
import co.gov.vur.pantallasvur.logica.ParametrizacionLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

/**
 *
 * @author Daniel
 */
@Path("consulta")
@Stateless
public class ServicioParametros {
    
    @EJB
    private ParametrizacionLogica parametrizacionLogica;
    
    @GET
    @Path("departamento")
    public List<DepartamentoDTO> getDepartamentos(){
        return parametrizacionLogica.getDepartamentos();
    }
    
    @GET
    @Path("municipio/{departamento}")
    public List<MunicipioDTO> getMunicipios(@PathParam("departamento") String idDepartamento){
        return parametrizacionLogica.getMunicipios(idDepartamento);
    }
    
    @GET
    @Path("oficina")
    public List<OficinaDTO> getOficinas(){
        return parametrizacionLogica.getOficinas();
    }
    
    @GET
    @Path("parametrosBusqueda")
    public List<ParametroBusquedaDTO> getCriteriosBusqueda(){
        return parametrizacionLogica.getParametroBusqueda("jemoran");
    }
    
    @GET
    @Path("tipoDocumento")
    public List<TipoDocumentoDTO> getTiposDocumento(){
        return parametrizacionLogica.getTiposDocumento();
    }
    
}
