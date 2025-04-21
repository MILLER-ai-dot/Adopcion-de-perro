import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner t = new Scanner(System.in);
        Persona persona1 = new Persona();
        List<Persona> persona = new ArrayList<>();
        System.out.println("""
                ---------------------------
                   **ADOPTA TU CACHORRO**
                ---------------------------
                1)Registrar persona 
                2)Registrar perro 
                3)Mostrar Usuarios 
                4)Mostrar Perros Disponibles 
                5)Adoptar
                6)Consultar perro mas viejo 
                7)Salir......
                ----------------------------
         
                """);
        opc = t.nextInt();
        switch (opc){
            case 1 ->{
                String nombre;
                String apellido;
                int edad;
                String documento;

                System.out.println("Ingrese su nombre: ");
                nombre = t.next();
                System.out.println("Ingrese su apellido: ");
                apellido = t.next();
                System.out.println("Ingrese su edad: ");
                edad = t.nextInt();
                System.out.println("Ingrese su documento: ");
                documento = t.next();
                persona.add(new Persona(nombre,apellido,edad,documento));
            }
            case 2 ->{
                String placa;
                String nombre;
                String raza;
                int edad;
                String tamaño;

                System.out.println("Ingrese la placa: ");
                placa = t.next();
                System.out.println("Ingrese su nombre: ");
                nombre = t.next();
                System.out.println("Ingrese su raza: ");
                raza = t.next();
                System.out.println("Ingrese su edad: ");
                edad = t.nextInt();
                System.out.println("Ingrese su tamaño: ");
                tamaño = t.next();

                persona1.perro.add(placa, nombre, raza, edad, tamaño);



            }
            case 3 ->{

            }
            case 4 ->{

            }
            case 5 ->{

            }
            case 6 ->{

            }
            case 7 ->{

            }
            default -> System.out.println("*Ingrese una opcion correcta*");
        }
    }
}