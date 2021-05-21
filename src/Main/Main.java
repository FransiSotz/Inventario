package Main;

import Controlador.ControladorUsuario;
import Vista.Login;

public class Main 
{
    public static void main(String[] args) 
    {
        Login login = new Login();
        ControladorUsuario controladorUsuario = new ControladorUsuario(login);
        login.setVisible(true);
    }
}
