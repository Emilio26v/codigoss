public class cadena {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String invertida = invertirCadena(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }

    public static String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
