package utils;

public class CalcularIVA {
    static void main() {
        int a = 2;
        int b = ++a;
        IO.println(b);
        //Variables - Utilizar el dato mínimo necesario en cada caso
        //true
        boolean estado = true;
        //28
        int n1 = 28;
        //m
        char letra = 'm';
        // 32800
        int n2 = 32800;
        //328000.9
        double decimal = 32800.9;
        //"20.20"
        String veinte = "20.20";
        //9999999
        int nueves = 9999999;
        IO.println("estado: " + estado + " entero: " + n1 + " caracter: " + letra + " entero: " + 32800 + " decimal: " + decimal + " string veinte: " + veinte
                + " nueves: " + nueves);

        /* FACTURA - Base imponible 50€, calcular importe final de la factura, sabeindo q: Tota=Base imponible *21% de IVA*/
        IO.println("Total Factura: " + aplicarIVA(50, .21f));

        /*DESCUENTO - Sobre un producto = 100€, aplicar descuento del 15%.
        Y calcular importe final del producto (tambien calcular y sumar el iva)*/
        float producto = 100;
        float descuento = producto - (15 * 100 / 100);
        float descuentoaplicado = producto - descuento;
        float productocondescuento = producto - descuentoaplicado;
        IO.println("\nproducto con descuento: " + productocondescuento);

        IO.println("\nImporte final(con IVA) : " + aplicarIVA(productocondescuento, .21f));
    }

    //Metodo para calcular IVA normal y retorna el precio final con IVA
    static float aplicarIVA(float bi, float iva) {
        return bi + (bi * iva);
    }
}
