package pedidos_State;

public class PedidoCancelado implements StatusPedido{

    public void alterar(Pedido pedido){
        String msg = "N�o � poss�vel realizar altera��es";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    @Override
    public void enviar(Pedido pedido) {

    }
}
