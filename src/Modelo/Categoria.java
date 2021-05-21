package Modelo;

public class Categoria 
{
    private int idCategoria;
    private String nombreCategoria;
    private int idUsuario;

    public Categoria() 
    {
    }

    public Categoria(int idCategoria, String nombreCategoria,int idUsuario) 
    {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.idUsuario = idUsuario;
    }

    public String getNombreCategoria() 
    {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) 
    {
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() 
    {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) 
    {
        this.idCategoria = idCategoria;
    }  

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    @Override
    public String toString() {
        return this.nombreCategoria;
    }

    
}
