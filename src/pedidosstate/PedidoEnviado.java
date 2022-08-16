package pedidosstate;

public class PedidoEnviado implements EstadoPedido {

    @Override
    public EstadoPedido avancar(Pedido pedido) {
        String msg = "N�o � poss�vel avan�ar, pois o pedido j� foi enviado";
        throw new IllegalStateException(msg);
    }

    public EstadoPedido cancelar(Pedido pedido){
        String msg = "N�o � poss�vel cancelar, pois o pedido j� foi enviado";
        throw new IllegalStateException(msg);
    }
}