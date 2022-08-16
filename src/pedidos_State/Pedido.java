package pedidos_State;

public class Pedido {

    private StatusPedido status;

    public void alterar(){
        status.alterar(this);
    }
    public void cancelar(){
        status.cancelar(this);
    }
    public void enviar(){
        status.enviar(this);
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
