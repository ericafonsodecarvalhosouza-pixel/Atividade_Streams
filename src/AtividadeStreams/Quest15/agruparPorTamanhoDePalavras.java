package AtividadeStreams.Quest15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class agruparPorTamanhoDePalavras {

    private static List<String> palavras = new ArrayList<>(Arrays
            .asList("sol", "casa", "computador", "ar", "desenvolvimento",
                    "lua", "java", "programação", "céu", "tecnologia",
                    "ia", "algoritmo", "web", "estrutura", "dados"
            ));

    static void main(String[] args) {

        var listaPorTamanhoDaPalavra = palavras.stream().collect(Collectors.groupingBy(p -> p.length()));

        System.out.println(listaPorTamanhoDaPalavra);

    }

}
