import java.util.Scanner;

public class View {

    // varial gloval privada para el scanner
    private final Scanner scanner;

    public View() {
        System.out.println("Metodos de Ordenamiento");
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n  -- Menu Metodos --");
        System.out.println("1-> Seleccion");
        System.out.println("2-> Insercion");
        System.out.println("3-> Bubbble");
        System.out.println("4-> Salir");
        System.out.print("\nSeleccione la opcion: ");

    }

    public void showOrder() {
        System.out.println("\n   -- Menu Orden --");
        System.out.println("1-> Ascendente");
        System.out.println("2-> Descendente");
        System.out.print("Seleccione la opcion: ");
    }

    public void showPasosMenu() {
        System.out.println("\n  -- Menu Pasos --");
        System.out.println("Quiere ver los pasos?");
        System.out.println("1-> Si");
        System.out.println("2-> No");
        System.out.print("Seleccione la opcion: ");
    }

    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= max)
                    break;
            } else {
                scanner.next();
            }
            System.out.print("Opcion Invalida: ");
        }
        return option;
    }

}
