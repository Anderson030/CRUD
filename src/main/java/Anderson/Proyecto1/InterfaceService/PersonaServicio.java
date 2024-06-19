package Anderson.Proyecto1.InterfaceService;

import Anderson.Proyecto1.Model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaServicio {

    List<Persona> listar();

    Optional<Persona> listarId(int id);

    int save(Persona p);

    void delete(int id);
}
