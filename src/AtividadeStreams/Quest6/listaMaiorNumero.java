package AtividadeStreams.Quest6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class listaMaiorNumero {

    private static List<Integer> listaDeNumeros = new ArrayList<>(Arrays.asList(4, 25, 32, 5, 45, 13, 8, 77, 58, 2, 52));

    static void main(String[] args) {

        var maiorNumero = listaDeNumeros.stream().max(Integer::compareTo).get();

        System.out.println(maiorNumero);

    }



}
