package pedidos_State;

public class PedidoEnviado implements StatusPedido{
    public void alterar(Pedido pedido){
        String msg = "Não é possível realizar alterações, pois o pedido já foi enviado";
        throw new IllegalStateException(msg);
    }
    public void cancelar(Pedido pedido){
        String msg = "Não é possível cancelar, pois o pedido já foi enviado";
        throw new IllegalStateException(msg);
    }
    public void enviar(Pedido pedido){
        String msg = "O pedido já foi enviado";
        throw new IllegalStateException(msg);
    }
}