import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Documento;
    public List<Perro> perros = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Documento = documento;
        this.perros = perros;
    }

    public void adoptarPerro(Perro perro){
       if (perros.size()<3){
           perros.add(perro);
           perro.setAdoptado(false);
       }
    }

    public String perroMasGrande(){

        if (perros.get(0).getEdad()>=perros.get(1).getEdad()&&perros.get(0).getEdad()>=perros.get(2).getEdad()){
            return perros.get(0).getNombre();
        }
        else if (perros.get(1).getEdad()>=perros.get(0).getEdad()&&perros.get(1).getEdad()>=perros.get(2).getEdad()){
            return perros.get(1).getNombre();
        }
        else if (perros.get(2).getEdad()>=perros.get(1).getEdad()&&perros.get(2).getEdad()>=perros.get(0).getEdad()){
            return perros.get(2).getNombre();
        }else return "0";

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

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public List<Perro> getPerro() {
        return perros;
    }

    public void setPerro(List<Perro> perro) {
        this.perros = perro;
    }

    @Override
    public java.lang.String toString() {
        return "Persona   " +
                "Nombre= " + Nombre +
                ", Apellido= " + Apellido +
                ", Edad= "  + Edad +
                ", Documento= " + Documento+
                ", Perros= "+ perros;
    }
}
