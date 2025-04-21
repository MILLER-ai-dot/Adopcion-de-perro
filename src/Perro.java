public class Perro {

    private String Placa;
    private String Nombre;
    private String Raza;
    private int  Edad;
    private String Tamaño;

    public Perro() {

    }

    public Perro(String placa, String nombre, String raza, int edad, String tamaño) {
        Placa = placa;
        Nombre = nombre;
        Raza = raza;
        Edad = edad;
        Tamaño = tamaño;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public int  getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Placa='" + Placa + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Raza='" + Raza + '\'' +
                ", Edad='" + Edad + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                '}';
    }
}
