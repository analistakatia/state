package pedidosstate;

public class PedidoEmProcessamento implements EstadoPedido {


    @Override
    public EstadoPedido avancar(Pedido pedido) {
        pedido.setStatus(Status.ENVIADO);
        return new PedidoEnviado();
    }

    @Override
    public EstadoPedido cancelar(Pedido pedido) {
        pedido.setStatus(Status.CANCELADO);
        return new PedidoCancelado();
    }
}

