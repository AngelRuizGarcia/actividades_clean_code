public class Circuloigual {
    //Ejercicio para comprobar si el área de dos círculos dados sus radios es igual
    public static void main(String[] args) {
        double area1 = 3.0;
        double area2 = 3.0;
        boolean igual = circuloIgual(area1, area2);
        if (igual) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }

    private static boolean circuloIgual(double area1, double area2) {
        return Math.PI * area1 * area1 == Math.PI * area2 * area2;
    }
}

/*
 * He cambiado los nombres de las variables
 * Y el nombre del fichero y del metodo
 */