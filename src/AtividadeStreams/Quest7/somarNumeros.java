package AtividadeStreams.Quest7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class somarNumeros {

     private static List<Integer> numerosParaSomar = new ArrayList<>(Arrays.asList(4, 25, 32, 5, 45, 13, 8, 77, 58, 2, 52));

    static void main(String[] args) {

        var somaDosNumeros = numerosParaSomar.stream().reduce(0, Integer::sum);

        System.out.println(somaDosNumeros);

    }
}
