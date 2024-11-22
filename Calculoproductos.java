public class Calculoproductos {
    //Ejercicio para calcular el precio total de la compra dado el precio de los productos y los descuentos e impuestos.
    public static void main(String[] args) {
        double[] precios = {100.0, 50.0, 25.0}; // precios de productos
        double impuestos = 0.08; // impuestos
        double descuento = 0.1;  // descuento
        double totalSuma = 0;

        for (double precio : precios) {
            totalSuma += precio * (1 + impuestos) * (1 - descuento);
        }

        System.out.println("Total: " + totalSuma);
    }
}

/*
 * Lo unico que he cambiado es el nombre de las variables
 * El nombre de la clase
 */