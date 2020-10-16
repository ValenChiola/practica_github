/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Proveedores {
    
    private String telefono;
    private String NIT;
    private String direccion;
    private int cantidad;
    private Producto producto;
    private String nombreProveedor;

    public Proveedores() {
    }

    public Proveedores(String telefono, String NIT, String direccion, int cantidad, Producto producto, String nombreProveedor) {
        this.telefono = telefono;
        this.NIT = NIT;
        this.direccion = direccion;
        this.cantidad = cantidad;
        this.producto = producto;
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "telefono=" + telefono + ", NIT=" + NIT + ", direccion=" + direccion + ", cantidad=" + cantidad + ", producto=" + producto + ", nombreProveedor=" + nombreProveedor + '}';
    }
 
 
    
    
    
}
