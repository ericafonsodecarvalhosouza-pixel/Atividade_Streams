package AtividadeStreams.Quest12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sePositivo {

    private static List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 12, 7, 5, 9, 12, 3, 7, 7, 18, 21, 3, 9, 30, 18, 5, 42, 30, 21));

    static void main(String[] args) {

        boolean result = numeros.stream().allMatch(n -> n > 0);

        System.out.println(result);

    }

}
