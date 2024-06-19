package Anderson.Proyecto1.Interface;

import Anderson.Proyecto1.Model.Persona;
import org.springframework.data.repository.CrudRepository;


public interface Ipersona extends CrudRepository<Persona, Integer> {
}
