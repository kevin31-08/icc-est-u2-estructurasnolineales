package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import structures.models.Contacto;

public class Maps {
    // map<K,V>
    // map<tipoClave,tipoValor>
    // map<String,Integer> 

    public Map<String,Integer> construirHashMap(){
        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("A",10);
        mapa.put("B",20);
        mapa.put("C",30);
        mapa.put("D",40);
        mapa.put("E",50);
        mapa.put("F",60);
        System.out.println("El tamaño del mapa es: " + mapa.size());
        System.err.println(mapa);
        for(int i = 0; i < mapa.size(); i++){
            System.out.println("Valor: " + mapa.values().toArray()[i]);
        }
        for(String key : mapa.keySet()){
            System.out.println("Clave: " + key);
        }
       
        System.out.println("El valor de la clave 'A' es: " + mapa.get("A"));
        System.out.println("El valor de la clave 'B' es: " + mapa.get("B"));
        System.out.println("El valor de la clave 'F' es: " + mapa.get("F"));
        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public Map<String,Integer> cLinkedHashMap(){
        Map<String,Integer> mapa = new LinkedHashMap<>();
        mapa.put("A",10);
        mapa.put("B",20);
        mapa.put("C",30);
        mapa.put("D",40);
        mapa.put("E",50);
        mapa.put("F",60);
        System.out.println("El tamaño del mapa es: " + mapa.size());
        System.err.println(mapa);
        for(int i = 0; i < mapa.size(); i++){
            System.out.println("Valor: " + mapa.values().toArray()[i]);
        }
        for(String key : mapa.keySet()){
            System.out.println("Clave: " + key);
        }
       
        System.out.println("El valor de la clave 'A' es: " + mapa.get("A"));
        System.out.println("El valor de la clave 'B' es: " + mapa.get("B"));
        System.out.println("El valor de la clave 'F' es: " + mapa.get("F"));
        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public Map<String,Integer> cTreeMap(){
        Map<String,Integer> mapa = new java.util.TreeMap<>();
        mapa.put("a",10);
        mapa.put("A",20);
        mapa.put("C",30);
        mapa.put("AB",40);
        mapa.put("E",50);
        mapa.put("aA",60);
        System.out.println("El tamaño del mapa es: " + mapa.size());
        System.err.println(mapa);
        for(int i = 0; i < mapa.size(); i++){
            System.out.println("Valor: " + mapa.values().toArray()[i]);
        }
        for(String key : mapa.keySet()){
            System.out.println("Clave: " + key);
        }
       
        System.out.println("El valor de la clave 'A' es: " + mapa.get("A"));
        System.out.println("El valor de la clave 'B' es: " + mapa.get("B"));
        System.out.println("El valor de la clave 'F' es: " + mapa.get("F"));
        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public List<Contacto> ordenarUnicos(List<Contacto> contactos) {
        //retornar contactos unicos
        //Unicos -> nombre
        List<Contacto> nueva = new java.util.ArrayList<>();
        for (Contacto contacto : contactos) {
            if (!nueva.contains(contacto)) {
                nueva.add(contacto);
            }
        }
        //Ordene segun el apellido
        Set<Contacto> nueva1 = new TreeSet<>((c1, c2) -> {if(c1.getNombre().equals(c2.getNombre())) {
            return 0;
        } else {
            return c1.getApellido().compareTo(c2.getApellido());
        }});
        for (Contacto contacto : nueva) {
            nueva1.add(contacto);
        }
        nueva1.addAll(nueva);
        return nueva;
    }
}
