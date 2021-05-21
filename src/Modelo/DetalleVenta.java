package Modelo;

public class DetalleVenta 
{
    private int iddetalleVenta;
    private int idVenta;
    private int idProducto;
    private int cantidad;
    private double precioVenta;

    public DetalleVenta() 
    {
    }

    public DetalleVenta(int iddetalleVenta, int idVenta, int idProducto, int cantidad, double precioVenta) {
        this.iddetalleVenta = iddetalleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getIdDetalleVenta() {
        return iddetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.iddetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

//    @Override
//    public String toString() {
//        return "DetalleVenta{" + "idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
//    }    
}
