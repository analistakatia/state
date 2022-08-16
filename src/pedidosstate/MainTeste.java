package pedidosstate;

public class MainTeste {
    public static void main(String[] args) {
        EstadoPedido status = new PedidoCriado();
        Pedido pedido = new Pedido();

        System.out.println(pedido.getStatus());
        status = status.avancar(pedido);
        System.out.println(pedido.getStatus());
        status = status.avancar(pedido);
        System.out.println(pedido.getStatus());
        status.cancelar(pedido);
        System.out.println(pedido.getStatus());
    }
}
