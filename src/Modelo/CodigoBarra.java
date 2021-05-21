package Modelo;

public class CodigoBarra 
{
    private int codigo;

    public CodigoBarra() 
    {
    }

    public CodigoBarra(int codigo) 
    {
        this.codigo = codigo;
    }
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "CodigoBarra{" + "codigo=" + codigo + '}';
    }
}
