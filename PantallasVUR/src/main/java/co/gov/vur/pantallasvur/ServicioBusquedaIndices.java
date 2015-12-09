/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.vur.pantallasvur;

import co.gov.vur.pantallasvur.dto.ConsultaIndicesDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 *
 * @author Daniel
 */
@Path("consultaIndices")
@Stateless
public class ServicioBusquedaIndices {
    
    public List<Object> consultarIndices(ConsultaIndicesDTO consultaIndicesDTO){
        return null;
    }
    
}
