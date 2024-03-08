/*
 */
package davidoliva_melvinrivas_lab8p2;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Admin extends User {

    private int NumeroTorneos;

    public Admin() {
    }

    public Admin(String NombreUsuario, String Password) {
        super(NombreUsuario, Password);
    }

    public Admin(int NumeroTorneos) {
        this.NumeroTorneos = NumeroTorneos;
    }

    public Admin(int NumeroTorneos, String NombreUsuario, String Password) {
        super(NombreUsuario, Password);
        this.NumeroTorneos = NumeroTorneos;
    }
    

    public int getNumeroTorneos() {
        return NumeroTorneos;
    }

    public void setNumeroTorneos(int NumeroTorneos) {
        this.NumeroTorneos = NumeroTorneos;
    }

    @Override
    public String toString() {
        return "Admin{" + "NumeroTorneos=" + NumeroTorneos + '}';
    }



}
