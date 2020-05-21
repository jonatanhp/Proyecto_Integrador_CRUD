
package proyecto_integrador_crud.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import proyecto_integrador_crud.object.Person;

/**
 *
 * @author jonatan
 */
public class PersonData {
    LinkedList<Person> listPerson=new LinkedList<>();
    public static int id=0;
     public List<Person> list() {
        return listPerson;
    }

    public void create(Person p) {
        id = id + 1;
        p.setId(id);
        listPerson.add(p);
    }
    
    public void delete(int id) {
        Iterator<Person> it=listPerson.iterator();
        while(it.hasNext()){
            int idperson=it.next().getId();
            if(id==idperson){
                it.remove();
            }
        }
    }
}
