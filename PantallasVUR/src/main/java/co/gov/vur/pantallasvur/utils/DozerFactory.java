/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.vur.pantallasvur.utils;

import java.util.ArrayList;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 *
 * @author Daniel
 */
public class DozerFactory<T> {
    
    private static DozerFactory instance=new DozerFactory();
    private Mapper mapper;
    
    private DozerFactory(){
        mapper = new DozerBeanMapper();
    }
    
    public static DozerFactory getInstance(){
        return instance;
    }
    
    public T map(Object src,Class<T> clazz){
        T destObject =  mapper.map(src, clazz);
        return destObject;
    }
    
    public List<T> map(List src,Class<T> clazz){
        List<T> lista=new ArrayList<T>();
        for(Object o:src){
            lista.add(map(o, clazz));
        }
        return lista;
    }
    
}
