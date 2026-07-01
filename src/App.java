import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import collections.set.Sets;
import maps.Maps;
import structures.models.Contacto;
import structures.models.Persona;
import structures.node.Nodes;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;
import structures.trees.InteTree;

public class App {
    public static void main(String[] args) throws Exception {
       //runIntTree();
      //runBinaryTree();
      //runEjercicios();
      //runSets();
       Maps maps = new Maps();
       maps.construirHashMap();
       maps.cLinkedHashMap();
       maps.cTreeMap();

    }

 private static void runSets() {
       Sets sets = new Sets();

       //Implementacion  -> hashSet hashcode
       System.out.println("==== HASHCODE: ====");
       Set<String> hashSet = sets.construirHashSet();
       System.out.println(hashSet);
       System.out.println("Size = "+ hashSet.size());
       System.out.println(hashSet.contains("F"));
       ArrayList<String> lis = new ArrayList<>();
       lis.add("S");
       System.out.println(lis);

       //Implementacion  -> LikedHashSet hashcode
       System.out.println("==== HLikedHashSet: ====");
       Set<String> linkedHashSet = sets.construirLinkedHashSet();
       System.out.println(linkedHashSet);
       System.out.println("Size = "+ linkedHashSet.size());
       System.out.println(linkedHashSet.contains("F"));

       //Implementacion  -> TreeSet hashcode
       System.out.println("==== TreeSet: ====");
       Set<String> treeSet = sets.construirTreSet();
       System.out.println(treeSet);
       System.out.println("Size = "+ treeSet.size());
       System.out.println(treeSet.contains("F"));

       //Implementacion  -> hashSetContacto hashcode
       System.out.println("==== HASHCODE: ====");
       Set<Contacto> hashSetContacto = sets.construirHasSeContacto();
       System.out.println(hashSetContacto);
       System.out.println("Size = "+ hashSetContacto.size());
       

          //Implementacion  -> TreeSet hashcode
       System.out.println("==== Tree Contacto Set: ====");
       Set<Contacto> tCSet = sets.construirTreeSetContacto();
       System.out.println(tCSet);
       System.out.println("Size = "+ tCSet.size());
       

      
      
    }

 private static void runEjercicios() {

    InsertBSTTest ejercicio1 = new InsertBSTTest();
    InvertBinaryTree ejercicio2 = new InvertBinaryTree();

   
    int[] numero1 = new int[]{};
    int[] numero2 = new int[]{10};
    int[] numero3 = new int[]{10,8,6,4};
    int[] numeros = new int[]{5,3,7,2,4,6,8};
    ejercicio1.insert(numeros);
    ejercicio1.insert(numero1);
    ejercicio1.insert(numero2);
    ejercicio1.insert(numero3);
   
    
    Nodes root = ejercicio2.insert(numeros);
    Nodes root1 = ejercicio2.insert(numero1);
    Nodes root2 = ejercicio2.insert(numero2);
    Nodes root3 = ejercicio2.insert(numero3);

    ListLevels listLevels = new ListLevels();
    List<List<Integer>> niveles = listLevels.listLevels(root);
    List<List<Integer>> niveles1 = listLevels.listLevels(root1);
    List<List<Integer>> niveles2 = listLevels.listLevels(root2);
    List<List<Integer>> niveles3 = listLevels.listLevels(root3);

    imprimirNiveles(niveles);  
    System.out.println();

    imprimirNiveles(niveles1);
    System.out.println();

    imprimirNiveles(niveles2);
    System.out.println();

    imprimirNiveles(niveles3);
    System.out.println();

    Depth ejercicio4 = new Depth();
    System.out.println("ejercicio04");
    int profundidad = ejercicio4.maxDepth(root);
    System.out.println("Profundidad: " + profundidad);
     int profundidad1 = ejercicio4.maxDepth(root1);
     System.out.println("Profundidad: " + profundidad1);
      int profundidad2 = ejercicio4.maxDepth(root2);
      System.out.println("Profundidad: " + profundidad2);
       int profundidad3 = ejercicio4.maxDepth(root3);
        System.out.println("Profundidad: " + profundidad3);
}


    private static void runBinaryTree() {
     BinaryTree<String> arbolString = new BinaryTree<>();
     BinaryTree<Persona> arbolPersona = new BinaryTree<>();
     arbolPersona.add(new Persona("pablo", 30));
     arbolPersona.add(new Persona("ana", 25));
     arbolPersona.add(new Persona("luis", 35));
     arbolPersona.add(new Persona("maria", 28));
      System.out.println(arbolPersona.getRoot());
         System.out.println(arbolPersona.getRoot().getLeft().getRight());
         System.out.println("/// PRE ORDEN /// ");
         arbolPersona.preOrden();
         System.out.println("/// POS ORDEN ///");
         arbolPersona.postOrden();
         System.out.println("/// INT ORDEN  ///");
         arbolPersona.postOrden();
         System.out.println("/// ALTURA DEL ARBOL  ///");
         int altura =  arbolPersona.getHeigth();
         System.out.println(altura);
         System.out.println("/// PESO DEL ARBOL ///");
         int peso =arbolPersona.getpeso();
         System.out.println(peso);
   }

    private static void runIntTree() {
       InteTree arbolNumeros = new InteTree();
    //    Nodes<Integer> node1 = new Nodes(50);
    //    Nodes<Integer> node2 = new Nodes<>(10);
    //    Nodes<Integer> node3 = new Nodes<>(30);

    //    arbolNumeros.setRoot(node1);
    //    node1.setRight(node2);
    //    node2.setLeft(node3);
    //     System.out.println(arbolNumeros.getRoot());
    //     System.out.println(arbolNumeros.getRoot().getLeft().getRight());

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);
         System.out.println(arbolNumeros.getRoot());
         System.out.println(arbolNumeros.getRoot().getLeft().getRight());
         System.out.println("pre orden ");
         arbolNumeros.preOrden();
         System.out.println("pos orden ");
         arbolNumeros.postOrden();
         System.out.println("int orden ");
         arbolNumeros.postOrden();
         System.out.println("altura del arbol ");
         int altura =  arbolNumeros.getHeigth();
         System.out.println(altura);
         System.out.println("peso del arbol ");
         int peso =arbolNumeros.getpeso();
         System.out.println(peso);
    }
    public static void imprimirNiveles(List<List<Integer>> niveles) {

    System.out.println("EJERCICIO03");
    for (List<Integer> nivel : niveles) {

        for (int i = 0; i < nivel.size(); i++) {

            System.out.print(nivel.get(i));

            if (i < nivel.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }
}
}
