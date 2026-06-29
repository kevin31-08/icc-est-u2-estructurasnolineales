package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import structures.models.Contacto;

public class Sets{

    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");

        return hashSet;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> treeSet = new LinkedHashSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");
        return treeSet ;
    }
    public Set<String> construirTreSet(){
         Set<String> lSet = new TreeSet<>();
        lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("A");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");
        return lSet;
    }
    public Set<Contacto> construirHasSeContacto(){
        Set<Contacto> hCset = new HashSet<>();
        hCset.add(new Contacto("Juan", "Perez", "1221312"));
        hCset.add(new Contacto("Ana", "Gomez", "987654321"));
        hCset.add(new Contacto("Pedro", "Lopez", "456789123"));
        hCset.add(new Contacto("Maria", "Rodrigo", "1789123456"));
        hCset.add(new Contacto("Juan", "Perez", "1221312"));
        hCset.add(new Contacto("Juan", "Perez", "1221312"));

        Contacto c1 = new Contacto("Juan", "Perez", "1221312");
        Contacto c2 =  new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 =new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodrigo", "1789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "1221312");
        Contacto c6 = new Contacto("Juan", "Perez", "1221312");
        hCset.add(c1);
        hCset.add(c2);
        hCset.add(c3);
        hCset.add(c4);
        hCset.add(c5);
        hCset.add(c6);
        return hCset;
    }
     public Set<Contacto> construirTreeSetContacto(){
         Set<Contacto> tCset = new TreeSet<>(
            (c1,c2) -> {int campN = c1.getNombre().compareTo(c2.getNombre());
            if(campN !=0){
                return campN;
            }
            int campA = c1.getApellido().compareTo(c2.getApellido());
            if (campA !=0) {
                return campA;
            }
         });
        tCset.add(new Contacto("Juan", "Perez", "1221312"));
        tCset.add(new Contacto("Ana", "Gomez", "987654321"));
        tCset.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCset.add(new Contacto("Maria", "Rodrigo", "1789123456"));
        tCset.add(new Contacto("Juan", "Perez", "1221312"));
        tCset.add(new Contacto("Juan", "Perez", "1221312"));
        return tCset;
     }

}