package Modelo;

/**
 *
 * @author fransi
 */
public class Rol 
{
    private int idRol;
    private String nombreRol;
    private int idUsuario;

    public Rol() 
    {
    }

    public Rol(int idRol, String nombreRol, int idUsuario) 
    {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public String toString() {
        return this.nombreRol;
    }
    
    
}
