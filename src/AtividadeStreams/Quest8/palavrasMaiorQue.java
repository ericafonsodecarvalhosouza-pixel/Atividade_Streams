package AtividadeStreams.Quest8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palavrasMaiorQue {

    private static List<String> palavras = new ArrayList<>(Arrays
            .asList("sol", "casa", "computador", "ar", "desenvolvimento",
                    "lua", "java", "programação", "céu", "tecnologia",
                    "ia", "algoritmo", "web", "estrutura", "dados"
            ));

    static void main(String[] args) {

        var contagemDePalavrasComMaisDeCincoLetras = palavras.stream().filter(n -> n.length() > 5).count();

        System.out.println(contagemDePalavrasComMaisDeCincoLetras);

    }

}
