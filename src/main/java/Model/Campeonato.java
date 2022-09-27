/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Campeonato {
    
    private int numCampeonato;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String lugar;
    private String partido;

    public Campeonato(int numCampeonato, String fecha, String horaInicio, String horaFin, String lugar, String partido) {
        this.numCampeonato = numCampeonato;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.partido = partido;
    }

    public int getNumCampeonato() {
        return numCampeonato;
    }

    public void setNumCampeonato(int numCampeonato) {
        this.numCampeonato = numCampeonato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    public void partido(){
    
    }
    
}
