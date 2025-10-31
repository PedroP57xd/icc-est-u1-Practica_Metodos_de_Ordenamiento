public class App {
    public static void main(String[] args) throws Exception {
        View vista = new View();
        int[] numeros = { 5, 9, 7, 0, -8, 15, 2 };

        MetodoSeleccion sortSelection = new MetodoSeleccion();
        MetodoInsercion sortInsercion = new MetodoInsercion();
        MetodoBurbuja sortBurbuja = new MetodoBurbuja();

        while (true) {
            vista.showMenu();
            int option = vista.inputOption(4);
            vista.showOrder();
            int orden = vista.inputOption(2);
            boolean ordenOption = orden == 1;
            vista.showPasosMenu();
            int pasos = vista.inputOption(2);
            boolean pasosOption = pasos == 1;

            switch (option) {
                case 1:
                    System.out.println("\nMetodo Seleccion");
                    sortSelection.sort();
                    break;
                case 2:
                    System.out.println("\nMetodo Insercion");
                    sortInsercion.sort();
                    break;
                case 3:
                    System.out.println("\nMetodo Burbuja");
                    sortBurbuja.sort(numeros,ordenOption,pasosOption);
                    break;
                case 4:
                    System.out.println("\nAdios");
                    System.exit(0);
                    break;
                default:

                    break;
            }
        }
    }
}
