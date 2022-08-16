package pedidos_State;

public class PedidoCancelado implements StatusPedido{

    public void alterar(Pedido pedido){
        String msg = "Não é possível realizar alterações";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    @Override
    public void enviar(Pedido pedido) {

    }
}
