package Modelo;

/**
 *
 * @author fransi
 */
public class Vendedor 
{
    private int idVendedor;
    private String nombreVendedor;
    private String apellidoVendedor;
    private String direccionVendedor;
    private String dpiVendedor;
    private String fechaNacimiento;
    private String correoVendedor;
    private String telefonoVendedor;
    private int idUsuario;

    public Vendedor() 
    {
    }

    public Vendedor(int idVendedor, String nombreVendedor, String apellidoVendedor, String direccionVendedor, String dpiVendedor, String fechaNacimiento, String correoVendedor, String telefonoVendedor, int idUsuario) 
    {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.direccionVendedor = direccionVendedor;
        this.dpiVendedor = dpiVendedor;
        this.fechaNacimiento = fechaNacimiento;
        this.correoVendedor = correoVendedor;
        this.telefonoVendedor = telefonoVendedor;
        this.idUsuario = idUsuario;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor) {
        this.apellidoVendedor = apellidoVendedor;
    }

    public String getDireccionVendedor() {
        return direccionVendedor;
    }

    public void setDireccionVendedor(String direccionVendedor) {
        this.direccionVendedor = direccionVendedor;
    }

    public String getDpiVendedor() {
        return dpiVendedor;
    }

    public void setDpiVendedor(String dpiVendedor) {
        this.dpiVendedor = dpiVendedor;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoVendedor() {
        return correoVendedor;
    }

    public void setCorreoVendedor(String correoVendedor) {
        this.correoVendedor = correoVendedor;
    }

    public String getTelefonoVendedor() {
        return telefonoVendedor;
    }

    public void setTelefonoVendedor(String telefonoVendedor) {
        this.telefonoVendedor = telefonoVendedor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return this.nombreVendedor;
    }

        
}
