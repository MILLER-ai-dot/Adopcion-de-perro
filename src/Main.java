import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner t = new Scanner(System.in);
        Persona persona1 = new Persona();
        List<Persona> persona = new ArrayList<>();
        List<Perro> perro = new ArrayList<>();

        do {
            System.out.println("""
                    ----------------------------
                       **ADOPTA TU CACHORRO**
                    ----------------------------
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
            switch (opc) {
                case 1 -> {
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
                    persona.add(new Persona(nombre, apellido, edad, documento));
                }
                case 2 -> {
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

                    perro.add(new Perro(placa, nombre, raza, edad, tamaño));


                }
                case 3 -> {
                    for (Persona a : persona) {
                        System.out.println(a);
                    }
                }
                case 4 -> {
                    for (Perro b : perro) {
                        if (b.isAdoptado()){
                            System.out.println(b);
                        }

                    }
                }
                case 5 -> {
                    String documento2;
                    String placa2;
                    System.out.println("Ingrese su documento: ");
                    documento2 = t.next();
                    System.out.println("Ingrese la placa del perro: ");
                    placa2 = t.next();

                    for(Persona u : persona){
                        if(u.getDocumento().equalsIgnoreCase(documento2)){
                            for(Perro e : perro){
                                if(e.getPlaca().equalsIgnoreCase(placa2)){
                                    u.adoptarPerro(e);
                                }
                            }


                        }

                    }
                    /*for (Perro b : perro) {
                        for (int i = 0; i < perro.size(); i++) {
                            if (placa2.equals(perro.get(i).getPlaca())) {
                                System.out.println(perro.remove(i));
                                System.out.println("Adoptado ");

                            }
                        }

                    }*/
                }
                case 6 -> {
                    String documento3;
                    System.out.println("Ingrese su documento: ");
                    documento3 = t.next();
                    for(Persona u : persona) {
                        if(u.getDocumento().equals(documento3)){
                            System.out.println(u.perroMasGrande());
                        }
                    }



                }
                case 7 -> {
                    System.out.println("Cerrando...");
                }
                default -> System.out.println("*Ingrese una opcion correcta*");
            }
        }while(opc!=7);
    }
}