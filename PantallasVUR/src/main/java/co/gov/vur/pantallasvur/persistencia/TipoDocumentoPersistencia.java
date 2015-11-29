/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.vur.pantallasvur.persistencia;

import co.gov.vur.pantallasvur.persistencia.entity.CriteriosBusqueda;
import co.gov.vur.pantallasvur.persistencia.entity.TipoDocumento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Daniel
 */
@Stateless
public class TipoDocumentoPersistencia {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<TipoDocumento> getCriteriosBusqueda(){
        return em.createNamedQuery("tipoDocumento.getAll").getResultList();
    }
    
}