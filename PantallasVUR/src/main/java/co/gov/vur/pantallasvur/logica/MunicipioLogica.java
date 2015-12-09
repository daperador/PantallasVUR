/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.vur.pantallasvur.logica;

import co.gov.vur.pantallasvur.dto.DepartamentoDTO;
import co.gov.vur.pantallasvur.dto.MunicipioDTO;
import co.gov.vur.pantallasvur.persistencia.DepartamentoPersistencia;
import co.gov.vur.pantallasvur.persistencia.MunicipioPersistencia;
import co.gov.vur.pantallasvur.utils.DozerFactory;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Daniel
 */
@Stateless
public class MunicipioLogica {
    
    @EJB
    private MunicipioPersistencia municipioPersistencia;
    
    
    
}
