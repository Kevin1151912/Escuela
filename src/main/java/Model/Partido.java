/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Partido {
 
    private String marcador;
    private String nameArbitro;
    private String horaPartido;
    private String equipoRival;
    private double valorArbitraje;

    public Partido(String marcador, String nameArbitro, String horaPartido, String equipoRival, double valorArbitraje) {
        this.marcador = marcador;
        this.nameArbitro = nameArbitro;
        this.horaPartido = horaPartido;
        this.equipoRival = equipoRival;
        this.valorArbitraje = valorArbitraje;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNameArbitro() {
        return nameArbitro;
    }

    public void setNameArbitro(String nameArbitro) {
        this.nameArbitro = nameArbitro;
    }

    public String getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }

    public String getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public double getValorArbitraje() {
        return valorArbitraje;
    }

    public void setValorArbitraje(double valorArbitraje) {
        this.valorArbitraje = valorArbitraje;
    }
    
    
    
}
