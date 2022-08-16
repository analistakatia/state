package pedidosstate;

public class Pedido {
    private Status status;

    public Pedido() {
        this.status = Status.CRIADO;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
