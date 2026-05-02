package AtividadeStreams.Quest10;

import java.util.*;
import java.util.stream.Collectors;

public class agruparPorIdade {

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

        Map<Integer, List<Pessoa>> listaDePessoasPorIdade = pessoas.stream()
                .collect(Collectors.groupingBy(p -> p.getIdade()));

        System.out.println(listaDePessoasPorIdade);


    }
}
