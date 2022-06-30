import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pais pais = new Pais();
        Capital capital = new Capital();

        System.out.println("Escriba el nombre del Pais");
        pais.pais = scan.next();
        System.out.println("Escriba el nombre de la capital de la ciudad escrita anteriormente");
        capital.capital = scan.next();

        System.out.println("El pais: " + pais.pais +  " Es la capital de: " + capital.capital);

    }
}
