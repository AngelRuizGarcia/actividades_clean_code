public class Validarhora {
    //Ejercicio para validar la hora dada
    public static void main(String[] args) {
        int hora = 25;
        int minutos = 61;

        if ((hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60)) {
            System.out.println("Hora válida");
        } else {
            System.out.println("Hora invalida");
        }
    }
}


/*
 * El error que habia era que los "<" ">" estaban en el orden incorrecto.
 * He cambiado el orden del IF y cambiado el nombre de la clase
 */