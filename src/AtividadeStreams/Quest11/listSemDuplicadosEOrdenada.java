package AtividadeStreams.Quest11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listSemDuplicadosEOrdenada {

    private static List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 12, 7, 5, 9, 12, 3, 7, 7, 18, 21, 3, 9, 30, 18, 5, 42, 30, 21));

    static void main(String[] args) {

        var novaLista = numeros.stream().distinct().sorted().toList();

        System.out.println(novaLista);

    }

}
