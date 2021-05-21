package Modelo;

public class Usuario 
{
    private int idUsuario;
    private String usuario;
    private String nombreUsuario;
    private String passwordUsuario;
    private int idRol;
    private int idUsuarioAlter;

    public Usuario() 
    {
    }

    public Usuario(int idUsuario, String usuario, String nombreUsuario, String passwordUsuario, int idRol) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.idRol = idRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIDRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public int getIdUsuarioAlter() {
        return idUsuarioAlter;
    }

    public void setIdUsuarioAlter(int idUsuarioAlter) {
        this.idUsuarioAlter = idUsuarioAlter;
    }

    @Override
    public String toString() {
        return this.nombreUsuario;
    }

    
}
