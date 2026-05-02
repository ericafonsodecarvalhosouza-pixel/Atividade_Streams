package AtividadeStreams.Quest13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listaDePedidos {

    private static List<Pedido> pedidos = new ArrayList<>(Arrays.asList(
            new Pedido(1, 150.0),
            new Pedido(2, 300.5),
            new Pedido(3, 120.0),
            new Pedido(4, 450.0),
            new Pedido(5, 300.5),
            new Pedido(6, 80.0),
            new Pedido(7, 600.0),
            new Pedido(8, 150.0)
    ));

    static void main(String[] args) {

        var resultadoSoma = pedidos.stream().map(p -> p.getValor()).reduce(0.0, Double::sum);

        System.out.println(resultadoSoma);




    }

}
