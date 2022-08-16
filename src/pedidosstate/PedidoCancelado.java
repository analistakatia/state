package pedidosstate;

public class PedidoCancelado implements EstadoPedido {

    @Override
    public EstadoPedido avancar(Pedido pedido) {
        String msg = "Não é possível avançar, pedido CANCELADO!";
        throw new IllegalStateException(msg);
    }

    @Override
    public EstadoPedido cancelar(Pedido pedido) {
        String msg = "O pedido já foi cancelado!";
        throw new IllegalStateException(msg);
    }
}
