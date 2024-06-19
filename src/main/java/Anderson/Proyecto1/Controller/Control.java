package Anderson.Proyecto1.Controller;

import Anderson.Proyecto1.InterfaceService.PersonaServicio;
import Anderson.Proyecto1.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public class Control {

    @Autowired
    private PersonaServicio servicio;

    @GetMapping("/")
    public String listar(Model model) {
        List<Persona> listaPersonas = servicio.listar();
        model.addAttribute("personas", listaPersonas);
        return "index";
    }
}
