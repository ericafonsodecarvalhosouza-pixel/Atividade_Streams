package AtividadeStreams.Quest4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contagemDeNumeros {

    private static List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(4, 25, 32, 5, 45, 13, 8, 77, 58, 2, 52));

    static void main(String[] args) {

        var listaDeNumerosMaiorQue10 = listaNumeros.stream().filter(num -> num > 10).count();

        System.out.println(listaDeNumerosMaiorQue10);


    }

}
