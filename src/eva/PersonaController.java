package eva;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import structures.models.Persona;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral) {
       Set<Persona> resultado = new TreeSet<>((p1,p2) ->{ 
            int campE = Integer.compare(p1.getEdad(), p2.getEdad());
            if (campE != 0 && p1.getNombre().equalsIgnoreCase(p2.getNombre()) ) {
                return campE;
            }
            int campN = p1.getNombre().compareTo(p2.getNombre());
            return campN;
        });
        for (Persona persona : personas) {
            if (persona.getEdad() > edadUmbral) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
    
}
