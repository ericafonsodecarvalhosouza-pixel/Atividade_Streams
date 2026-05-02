package AtividadeStreams.Quest13;

public class Pedido {

    private int id;
    private double valor;

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }
}
