public class MetodoBurbuja {

    public void sort(int[] numeros, boolean orden, boolean pasos) {
        int comparaciones = 0;
        int movimientos = 0;

        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("\n--- Paso " + i + " ---");
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }

            while (j >= 0 && ((orden && aux < numeros[j]) || (!orden && aux > numeros[j]))) {
                comparaciones++;

                if (pasos) {
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);
                }

                numeros[j + 1] = numeros[j];
                movimientos++;

                if (pasos) {
                    printArray(numeros);
                    System.out.println("Mueve numeros[" + j + "] a numeros[" + (j + 1) + "]");
                }

                j--;
            }

            if (j >= 0)
                comparaciones++;

            numeros[j + 1] = aux;
            movimientos++;

            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posición " + (j + 1));
                System.out.print("Estado actual: ");
                printArray(numeros);
            }
        }

        System.out.println("\n--- Resultado final ---");
        System.out.print("Arreglo ordenado (" + (orden ? "Ascendente" : "Descendente") + "): ");
        printArray(numeros);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Movimientos: " + movimientos);
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
