package AtividadeStreams.Quest14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class segundoMaiorDaLista {

    private static List<Integer> numeros = new ArrayList<>(Arrays.asList(4, 25, 32, 5, 45, 13, 8, 77, 58, 2, 52));

    static void main(String[] args) {

        var segundoMaiorDaLista = numeros.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(segundoMaiorDaLista.get(1));

    }

}
