package AtividadeStreams.Quest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class listaDeNomes {

    private static List<String> listaNomes = new ArrayList<>();

    static void main(String[] args) {

        listaNomes.addAll(Arrays.asList("Eric", "Jamile", "Caua", "Vitoria", "Julia", "Eduarda"));

        var listaNomesUpperCase = listaNomes.stream().map(n -> n.toUpperCase()).toList();

        System.out.println(listaNomesUpperCase);

    }

}
