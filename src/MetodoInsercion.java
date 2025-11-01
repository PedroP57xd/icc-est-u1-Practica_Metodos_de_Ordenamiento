public class MetodoInsercion {

    public void sort(int[] numeros, boolean orden, boolean pasos) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }

            while (j >= 0 && ((orden && aux < numeros[j]) || (!orden && aux > numeros[j]))) {
                if (pasos) {
                    System.out.println("Compara aux: " + aux + ", con numeros[" + j + "]:" + numeros[j]);
                }

                numeros[j + 1] = numeros[j];

                if (pasos) {
                    printArray(numeros);
                    System.out.println("mueve numeros[" + (j + 1) + "] a numeros[" + (j + 2) + "]");
                }

                j--;
            }

            numeros[j + 1] = aux;

            if (pasos) {
                System.out.println("Insertar aux: " + aux + ", En la posicion: " + (j + 1));
                System.out.print("Estado Actual: ");
                printArray(numeros);
            }
        }
        System.out.println("\n--- Resultado final --");
        System.out.print("Arreglo ordenado (" + (orden ? "Ascendente" : "Descendente") + "): \n");
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
