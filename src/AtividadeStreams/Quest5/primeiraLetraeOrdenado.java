package AtividadeStreams.Quest5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class primeiraLetraeOrdenado {

    private static List<String> listaDeNomes = new ArrayList<>(Arrays
            .asList("Pedro", "Ana", "José", "Maria", "Antonia", "Augusto", "Carlos", "Francisco"));

    static void main(String[] args) {

        var listaPelaPrimeiraLetraEOrdenanda = listaDeNomes.stream().filter(nomes -> nomes.startsWith("A")).sorted().toList();

        System.out.println(listaPelaPrimeiraLetraEOrdenanda);


    }

}
