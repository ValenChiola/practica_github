/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Administrador {

    Proveedores proveedores;


    public Administrador() {
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    @Override
    public String toString() {
        return "Administrador{" + "proveedores=" + proveedores + '}';
    }

    /*jose-proveedores administradores
belen control
gonza producto
valentino inventario existtencias
enzo ventas almacen
nacho pedidos
     */
}
