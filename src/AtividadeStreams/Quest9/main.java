package AtividadeStreams.Quest9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    private static List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(
            new Pessoa("Ana", 15),
            new Pessoa("Carlos", 32),
            new Pessoa("João", 17),
            new Pessoa("Mariana", 25),
            new Pessoa("Pedro", 12),
            new Pessoa("Lucas", 40),
            new Pessoa("Beatriz", 19),
            new Pessoa("Rafaela", 8),
            new Pessoa("Gustavo", 55),
            new Pessoa("Fernanda", 28)
    ));

    static void main(String[] args) {

        var pessoasMaiorDeIdade = pessoas.stream().filter(n -> n.getIdade() > 18)
                .map(p -> p.getNome()).toList();

        System.out.println(pessoasMaiorDeIdade);


    }

}
