
package entidades;


public class Pedido {
    private Producto producto;
    private Double cantidad;
    private String NumSolicitud;

    public Pedido(Producto producto, Double cantidad, String NumSolicitud) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.NumSolicitud = NumSolicitud;
    }

    public Pedido() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNumSolicitud() {
        return NumSolicitud;
    }

    public void setNumSolicitud(String NumSolicitud) {
        this.NumSolicitud = NumSolicitud;
    }
  
    public void recibirPedido(){
        
    }
    
    public void registroPedido(){
        
    }
}
