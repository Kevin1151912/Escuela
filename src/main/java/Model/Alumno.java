/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Alumno extends Persona{

    private Categoria categoria;
    private Aseguradora seguro;

    public Alumno(Categoria categoria, Aseguradora seguro) {
        this.categoria = categoria;
        this.seguro = seguro;
    }

    public Alumno(Categoria categoria, Aseguradora seguro, String numDocumento, String nombre, String apellido, String direccion, String telefono, String genero, String fechaNacimiento) {
        super(numDocumento, nombre, apellido, direccion, telefono, genero, fechaNacimiento);
        this.categoria = categoria;
        this.seguro = seguro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Aseguradora getSeguro() {
        return seguro;
    }

    public void setSeguro(Aseguradora seguro) {
        this.seguro = seguro;
    }
    
    public void hallarCategoria(){
        
    }
    
}
