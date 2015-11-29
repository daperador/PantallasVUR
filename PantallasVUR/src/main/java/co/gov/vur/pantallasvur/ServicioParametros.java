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
import co.gov.vur.pantallasvur.dto.TipoDocumentoDTO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Daniel
 */
@Path("consulta")
public class ServicioParametros {
    
    @GET
    @Path("departamento")
    public List<DepartamentoDTO> getDepartamentos(){
        return null;
    }
    
    @GET
    @Path("municipio/{departamento}")
    public List<MunicipioDTO> getMunicipios(@PathParam("departamento") String idDepartamento){
        return null;
    }
    
    @GET
    @Path("oficina")
    public List<OficinaDTO> getOficinas(){
        return null;
    }
    
    @GET
    @Path("criteriosBusqueda")
    public List<CriteriosBusquedaDTO> getCriteriosBusqueda(){
        return null;
    }
    
    @GET
    @Path("tipoDocumento")
    public List<TipoDocumentoDTO> getTiposDocumento(){
        return null;
    }
    
}
