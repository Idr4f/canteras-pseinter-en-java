import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Edad edad = new Edad();

        System.out.println("Que edad tiene usted?");
        edad.edad = scan.nextInt();

        if (edad.edad >= edad.mayorDeEdad){

            System.out.println("Usted es mayor de edad");
        }
        else {

            System.out.println("Usted es menor de edad, aun es un niñ@");
        }
    }
}
