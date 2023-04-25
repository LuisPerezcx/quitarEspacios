import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuiitarEspacios quiitarEspacios = new QuiitarEspacios();
        int opc=1;
        while (opc!= '0'){
            quiitarEspacios.quitar(scanner);
            System.out.print("Pulse 0 para salir o cualquier numero para continuar: ");
            opc=scanner.nextInt();
            scanner.nextLine();
        }
    }
}
