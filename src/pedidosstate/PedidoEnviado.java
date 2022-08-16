package pedidosstate;

public class PedidoEnviado implements EstadoPedido {

    @Override
    public EstadoPedido avancar(Pedido pedido) {
        String msg = "Não é possível avançar, pois o pedido já foi enviado";
        throw new IllegalStateException(msg);
    }

    public EstadoPedido cancelar(Pedido pedido){
        String msg = "Não é possível cancelar, pois o pedido já foi enviado";
        throw new IllegalStateException(msg);
    }
}