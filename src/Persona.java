import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Documento;
    public List<Perro> perro = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Documento = documento;
        this.perro = perro;
    }

    public void adoptarPerro(Perro perro){
        boolean adoptado = false;



    }

    public String perroMasGrande(){
        return "a";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getString() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public List<Perro> getPerro() {
        return perro;
    }

    public void setPerro(List<Perro> perro) {
        this.perro = perro;
    }

    @Override
    public java.lang.String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Edad=" + Edad +
                ", String='" + Documento + '\'' +
                ", perro=" + perro +
                '}';
    }
}
