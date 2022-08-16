package pedidosstate;

public interface EstadoPedido {
    public EstadoPedido avancar (Pedido pedido);
    public EstadoPedido cancelar(Pedido pedido);

}
