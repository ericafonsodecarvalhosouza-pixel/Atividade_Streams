package AtividadeStreams.Quest16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class maioresEMenoresDeIdade {

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

        Map<Boolean, List<Pessoa>> separarPorIdade = pessoas.stream().collect(Collectors.partitioningBy(p -> p.getIdade() > 18));


        separarPorIdade.forEach((Boolean, pessoas1) -> {
            var result = Boolean.equals(java.lang.Boolean.TRUE) ? "Maiores de Idade" : "Menores de Idade";
            System.out.println(result);
            pessoas1.forEach(System.out::println);
            System.out.println();
        });


    }

}
