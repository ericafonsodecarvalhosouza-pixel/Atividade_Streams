package AtividadeStreams.Quest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listaMultiplicada {

    private static List<Integer> listaNumeros = new ArrayList<>();

    static void main(String[] args) {

        listaNumeros.addAll(Arrays.asList(10, 49, 2, 3, 5, 65, 90, 28));

        listaNumeros.forEach(p -> System.out.println(p * 2));



    }

}
