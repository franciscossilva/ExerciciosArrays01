import java.util.ArrayList;
public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");


        //Caso queira remover o elemento "D", por exemplo:
        lista.remove("D");
        System.out.println("Assim ficará a lista sem o elemento D: "+lista);

        //Caso seja o terceiro indice da lista por exemplo :
        lista.remove(2);
        System.out.println("Lista sem o sem o terceiro indice será :");
    }
}
}
