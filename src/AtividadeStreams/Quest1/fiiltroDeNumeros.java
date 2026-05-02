package AtividadeStreams.Quest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fiiltroDeNumeros {

    private static List <Integer> listaNumeros = new ArrayList<>();

    static void main(String[] args) {

        listaNumeros.addAll(Arrays.asList(4, 25, 32, 78, 45, 13, 10, 77, 58, 61, 52));

        var listaDePares = listaNumeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(listaDePares);



    }


}
