/*
 */
package davidoliva_melvinrivas_lab8p2;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class User {

    private String NombreUsuario;
    private String Password;

    public User() {
    }

    public User(String NombreUsuario, String Password) {
        this.NombreUsuario = NombreUsuario;
        this.Password = Password;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "User{" + "NombreUsuario=" + NombreUsuario + ", Password=" + Password + '}';
    }
    
}
