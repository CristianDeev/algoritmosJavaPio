// Algoritmo para poder contar el numero de letras Mayusculas
// encontradas en una cadena (String) Tambien lo pueden cambiar a
// un Scanner para que el usuario ingrese la palabra por teclado

public class ContarMayusculas {
    public static void main(String[] args) {
        String texto = "Hola Mundo JAVA";
        int contadorMayusculas = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                contadorMayusculas++;
            }
        }

        System.out.println("Número de letras mayúsculas: " + contadorMayusculas);
    }
}