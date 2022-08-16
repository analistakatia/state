package pedidosstate;

public class PedidoCriado implements EstadoPedido{

    @Override
    public EstadoPedido avancar(Pedido pedido) {
        pedido.setStatus(Status.EM_PROCESSAMENTO);
        return new PedidoEmProcessamento();
    }

    @Override
    public EstadoPedido cancelar(Pedido pedido) {
        pedido.setStatus(Status.CANCELADO);
        return new PedidoCancelado();
    }
}
