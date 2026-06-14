package clases;

public class Persona {

    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) { //nombre podria ser n y edad e y funciona igual  this.nombre = n
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return this.nombre; //this.nombre es más correcto que nombre solo
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    // Getter y Setter para edad
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar la información
    public void despliegaInformacion() {
        System.out.println("Nombre: " + this.nombre + "Edad: " + this.edad);
    }
}
