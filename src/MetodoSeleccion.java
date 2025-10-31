public class MetodoSeleccion {

    public void sort(int[] numeros, boolean orden, boolean pasos) {
        int comparaciones = 0;
        int intercambios = 0;
        for (int i = 0; i < numeros.length; i++) {
            int indiceSeleccionado = i;
            if (pasos) {
                System.out.println("\n--- Iteración i = " + i + " ---");
                System.out.println("Valor base: numeros[" + i + "] = " + numeros[i]);
            }
            for (int j = i + 1; j < numeros.length; j++) {
                comparaciones++;
                boolean condicion = orden
                        ? numeros[j] < numeros[indiceSeleccionado]
                        : numeros[j] > numeros[indiceSeleccionado];
                if (pasos) {
                    System.out.println("Compara numeros[" + j + "] = " + numeros[j] +
                            " con numeros[" + indiceSeleccionado + "] = " + numeros[indiceSeleccionado]);
                }
                if (condicion) {
                    indiceSeleccionado = j;
                    if (pasos) {
                        System.out.println("Nuevo índice seleccionado: " + indiceSeleccionado);
                    }
                }
            }
            if (i != indiceSeleccionado) {
                int aux = numeros[indiceSeleccionado];
                numeros[indiceSeleccionado] = numeros[i];
                numeros[i] = aux;
                intercambios++;
                if (pasos) {
                    System.out.println("Intercambia numeros[" + i + "] con numeros[" + indiceSeleccionado + "]");
                    System.out.print("Estado actual: ");
                    printArray(numeros);
                }
            }
        }

        System.out.println("\n--- Resultado final --");
        System.out.print("Arreglo ordenado (" + (orden ? "Ascendente" : "Descendente") + "): ");
        printArray(numeros);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
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