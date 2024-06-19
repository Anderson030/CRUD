package Anderson.Proyecto1.Service;

import Anderson.Proyecto1.Interface.Ipersona;
import Anderson.Proyecto1.InterfaceService.PersonaServicio;
import Anderson.Proyecto1.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class PersonaServiceImple implements PersonaServicio {

    @Autowired
    private Ipersona personaRepository;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return personaRepository.findById(id);
    }

    @Override
    public int save(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public void delete(int id) {
        personaRepository.deleteById(id);
    }
}
