import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Cual es su nombre? (sin apellidos)");
        persona.nombre = scan.next();

        System.out.println("Cual es su apellido/s?");
        persona.apellido = scan.next();

        System.out.println("Cual es su edad?");
        persona.edad = scan.nextInt();

        if (persona.edad >= persona.mayorDeEdad){

            System.out.println( persona.nombre + " " + persona.apellido + " Usted es mayo de edad y puede entrar a la fiesta");
        }
        else {

            System.out.println(persona.nombre + " " + persona.apellido + " Usted es menor de edad, por favor retirese a sus aposentos" +
                    " (xD apocentos)");
        }

    }

}
