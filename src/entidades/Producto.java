
package entidades;

/**
 * @ramaGonza
 */
public class Producto {
    // Atributos
    private String ID;
    private String nombre, proveedor;
    private int precio, cantidad;
    
    
    //Construcctor Vacio
    public Producto() {
    }

    public Producto(String ID, String nombre, String proveedor, int precio, int cantidad) {
        this.ID = ID;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Geter and Seter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", nombre=" + nombre + ", proveedor=" + proveedor + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
