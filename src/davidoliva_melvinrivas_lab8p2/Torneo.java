/*
 */
package davidoliva_melvinrivas_lab8p2;

import java.util.ArrayList;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Torneo {

    private String nombre;
    private ArrayList<Participante> ListaParticipante = new ArrayList();
    private boolean abierto;
    private boolean terminado;
    private String ParticipanteGanador;

    public Torneo() {
    }

    public Torneo(String nombre, boolean abierto, boolean terminado, String ParticipanteGanador) {
        this.nombre = nombre;
        this.abierto = abierto;
        this.terminado = terminado;
        this.ParticipanteGanador = ParticipanteGanador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getListaParticipante() {
        return ListaParticipante;
    }

    public void setListaParticipante(ArrayList<Participante> ListaParticipante) {
        this.ListaParticipante = ListaParticipante;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public String getParticipanteGanador() {
        return ParticipanteGanador;
    }

    public void setParticipanteGanador(String ParticipanteGanador) {
        this.ParticipanteGanador = ParticipanteGanador;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", ListaParticipante=" + ListaParticipante + ", abierto=" + abierto + ", terminado=" + terminado + ", ParticipanteGanador=" + ParticipanteGanador + '}';
    }

}
