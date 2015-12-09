/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.vur.pantallasvur.logica;

import co.gov.vur.pantallasvur.dto.DepartamentoDTO;
import co.gov.vur.pantallasvur.dto.MunicipioDTO;
import co.gov.vur.pantallasvur.dto.OficinaDTO;
import co.gov.vur.pantallasvur.dto.ParametroBusquedaDTO;
import co.gov.vur.pantallasvur.dto.TipoDocumentoDTO;
import co.gov.vur.pantallasvur.persistencia.ParametrizacionPersistencia;
import co.gov.vur.pantallasvur.utils.DozerFactory;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Daniel
 */
@Stateless
public class ParametrizacionLogica {
    
    @EJB
    private ParametrizacionPersistencia parametrizacionPersistencia;
    
    public List<ParametroBusquedaDTO> getParametroBusqueda(String usuario){
        return DozerFactory.getInstance().map(
                parametrizacionPersistencia.getAllParametroBusquda(),ParametroBusquedaDTO.class);
    }
    
    public List<DepartamentoDTO> getDepartamentos(){
        return DozerFactory.getInstance().map(
                parametrizacionPersistencia.getDepartamentos(),DepartamentoDTO.class);
    }
    
    public List<MunicipioDTO> getMunicipios(String idDepartamento){
        if(idDepartamento!=null && idDepartamento.compareTo("0")!=0){
            return DozerFactory.getInstance().map(
                parametrizacionPersistencia.getMunicipios(idDepartamento),MunicipioDTO.class);
        }else{
            return DozerFactory.getInstance().map(
                parametrizacionPersistencia.getMunicipios(),MunicipioDTO.class);
        }
        
    }
    
    public List<TipoDocumentoDTO> getTiposDocumento(){
        return DozerFactory.getInstance().map(
                parametrizacionPersistencia.getTipoDocumentos(),TipoDocumentoDTO.class);
    }
    
    public List<OficinaDTO> getOficinas(){
        return DozerFactory.getInstance().map(
                parametrizacionPersistencia.getOficinas(),OficinaDTO.class);
    }
}
