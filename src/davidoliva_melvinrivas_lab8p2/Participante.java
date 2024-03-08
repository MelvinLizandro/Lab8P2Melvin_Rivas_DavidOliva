/*
 */
package davidoliva_melvinrivas_lab8p2;

import java.util.ArrayList;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Participante extends User{
    private ArrayList <Torneo> ListaTorneo=new ArrayList();

    public Participante() {
    }

    public Participante(String NombreUsuario, String Password) {
        super(NombreUsuario, Password);
    }

    public ArrayList<Torneo> getListaTorneo() {
        return ListaTorneo;
    }

    public void setListaTorneo(ArrayList<Torneo> ListaTorneo) {
        this.ListaTorneo = ListaTorneo;
    }
    public void setTorneo(Torneo torneo){
        this.ListaTorneo.add(torneo);
    }

    @Override
    public String toString() {
        return "Participante{" + "ListaTorneo=" + ListaTorneo + '}';
    }
    
}
