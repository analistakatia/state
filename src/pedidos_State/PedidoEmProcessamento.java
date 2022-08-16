package pedidos_State;

public class PedidoEmProcessamento implements StatusPedido{

    public void alterar(Pedido pedido){
        //codigo para alteração do pedido
    }

    public void cancelar(Pedido pedido){
        //Codigo para cancelamento do pedido
        pedido.setStatus(new PedidoCancelado());
    }

    public void enviar(Pedido pedido){
        //Codigo para envio do pedido
        pedido.setStatus(new PedidoEnviado());
    }
}
