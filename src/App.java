public class App {
    public static void main(String[] args) throws Exception {
        View vista = new View();
        int[] numeros = {  19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45 };

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
                    sortSelection.printArray(numeros);
                    sortSelection.sort(numeros,ordenOption,pasosOption);
                    sortSelection.printArray(numeros);
                    break;
                case 2:
                    System.out.println("\nMetodo Insercion");
                    sortInsercion.printArray(numeros);
                    sortInsercion.sort(numeros,ordenOption,pasosOption);
                    sortInsercion.printArray(numeros);
                    break;
                case 3:
                    System.out.println("\nMetodo Burbuja");
                    sortBurbuja.printArray(numeros);
                    sortBurbuja.sort(numeros,ordenOption,pasosOption);
                    sortBurbuja.printArray(numeros);
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
