/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integrador_crud.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import proyecto_integrador_crud.object.Manager;
import proyecto_integrador_crud.object.Person;

/**
 *
 * @author jonatan
 */
public class ManagerData implements CRUD{
LinkedList<Manager> listManager=new LinkedList<>();
    public static int id=0;
     public List<Manager> list() {
        return listManager;
    }

    /**
     *
     * @param m
     */
    public void create(Manager m) {
        id = id + 1;
        System.out.println("ID:" + id);
        m.setId(id);
        listManager.add(m);
    }
    
    public void delete(int id) {
        Iterator<Manager> it=listManager.iterator();
        while(it.hasNext()){
            int idperson=it.next().getId();
            if(id==idperson){
                it.remove();
            }
        }
    }

    @Override
    public List listar() {
        List <Manager>lista=new ArrayList<>();
        Manager m=new Manager();
        m.setName(null);
        m.setLastname(null);
        m.setDni(null);
        m.setEmail(null);
        m.setAddress(null);
        m.setPhone(null);
        m.setSex(null);
        lista.add(m);
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
