package pedidos_State;

public class PedidoEnviado implements StatusPedido{
    public void alterar(Pedido pedido){
        String msg = "N�o � poss�vel realizar altera��es, pois o pedido j� foi enviado";
        throw new IllegalStateException(msg);
    }
    public void cancelar(Pedido pedido){
        String msg = "N�o � poss�vel cancelar, pois o pedido j� foi enviado";
        throw new IllegalStateException(msg);
    }
    public void enviar(Pedido pedido){
        String msg = "O pedido j� foi enviado";
        throw new IllegalStateException(msg);
    }
}