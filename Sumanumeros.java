public class Sumanumeros {
    //Ejercicio para calcular el promedio de una lista de números dada e imprimirlo por pantalla
        public static void main(String[] args) {
        double[] numeros = {4, 5, 6, 7};
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        double promedio = suma / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
}

/*
 * He cambiado el nombre de las variables y el nombre de la clase
 */