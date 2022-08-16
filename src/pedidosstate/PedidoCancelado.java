package pedidosstate;

public class PedidoCancelado implements EstadoPedido {

    @Override
    public EstadoPedido avancar(Pedido pedido) {
        String msg = "N�o � poss�vel avan�ar, pedido CANCELADO!";
        throw new IllegalStateException(msg);
    }

    @Override
    public EstadoPedido cancelar(Pedido pedido) {
        String msg = "O pedido j� foi cancelado!";
        throw new IllegalStateException(msg);
    }
}
