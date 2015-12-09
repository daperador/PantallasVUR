/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.vur.pantallasvur.persistencia;

import co.gov.vur.pantallasvur.persistencia.entity.Departamento;
import co.gov.vur.pantallasvur.persistencia.entity.Municipio;
import co.gov.vur.pantallasvur.persistencia.entity.Oficina;
import co.gov.vur.pantallasvur.persistencia.entity.ParametroBusqueda;
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
public class ParametrizacionPersistencia {
    
    @PersistenceContext(unitName = "vurPU")
    private EntityManager em;
    
    public List<ParametroBusqueda> getAllParametroBusquda(){
        return em.createNamedQuery("ParametroBusqueda.getAll").getResultList();
    }
    
    public List<ParametroBusqueda> getParametroBusqudaUsuario(String usuario){
        return em.createNamedQuery("usuario.getParametrosBusqueda").setParameter("usuario", usuario).getResultList();
    }
    
    public List<Departamento> getDepartamentos(){
        return em.createNamedQuery("departamento.getAll").getResultList();
    }
    
    public List<Municipio> getMunicipios(String idDepartamento) {
        return em.createNamedQuery("municipio.getByDepartamento")
                .setParameter("departamento", idDepartamento)
                .getResultList();
    }
    
    public List<Municipio> getMunicipios() {
        return em.createNamedQuery("municipio.getAll")
                .getResultList();
    }
    
    public List<TipoDocumento> getTipoDocumentos(){
        return em.createNamedQuery("tipoDocumento.getAll").getResultList();
    }
    
    public List<Oficina> getOficinas(){
        return em.createNamedQuery("oficina.getAll").getResultList();
    }
}
