import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aforo máximo del local: ");
        int aforoMax = sc.nextInt(); // Declaro variable entera.
        System.out.println("Precio de la entrada: ");
        double pEntrada = sc.nextDouble();
        //  Declaro variable introducida como real. Precio de la entrada puede tener deimales.
        System.out.println("Entradas vendidas: ");
        int eVendidas = sc.nextInt(); // Declaro variable introduciada como entera.
        if (eVendidas <= (0.2 * aforoMax)) {
            //Si las entradas vendidas no supera el 20% del aforo se cancela el concierto
            System.out.println("Se cancela el concierto");
        } else if (eVendidas <= (0.5 * aforoMax)) {
            //Si las entradas no superan el 50% del aforo, se hace un descuento del 25%
            double entradaRebajada = pEntrada - (0.25 * pEntrada); // Rebaja del 25% en la entrada.
            double totalRecReb = entradaRebajada * eVendidas;
            System.out.println("El precio de la entrada rebajada un 20 % es: " + entradaRebajada + "€");
            System.out.println("El total recaudado es: " + totalRecReb + "€");
        } else if (aforoMax < eVendidas) { //No se puede superar el aforo del local
            System.out.println("Error: No se puede superar el aforo del local.");
        } else { //Si no cumple, el total no tendrá descuento.
            double totalRec = pEntrada * eVendidas;
            System.out.println("El total recaudado es: " + totalRec + "€");
        }
    }
    }
