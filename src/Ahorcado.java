import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Objeto Scanner para ingresar datos por teclado.
        Scanner entrada = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "andresgato".toUpperCase();
        int intentosMaximos = 10;
        int intentoActual = 0;
        boolean palabraAdivinada = false;

        //Arreglo para almacenar las letras de la palabra secreta.
        char letrasAdivinadas[] = new char[palabraSecreta.length()];

        //Inicializamos el arreglo con guiones bajos.
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Recorremos el arreglo mientras pedimos las letras al usuario.
        while(!palabraAdivinada && intentoActual < intentosMaximos){

            System.out.print("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)\n");

            //Pedimos al usuario que ingrese una letra
            System.out.print("Por favor, ingrese una letra: ");
            //char letra = entrada.next().toUpperCase().charAt(0);
            char letra = Character.toUpperCase(entrada.next().charAt(0));

            boolean letraCorrecta = false;
            for(int i = 0; i < palabraSecreta.length(); i++){

                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){

                intentoActual++;

                if(intentoActual <= 10){
                    System.out.println("¡Letra incorrecta!\n" +
                                   "Intentos restantes: " + (intentosMaximos - intentoActual));
                }
            }
            
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Has adivinado la palabra, ¡Felicitaciones!");
            }

            System.out.println("");
        }

        if(!palabraAdivinada){
            System.out.println("¡Que pena! Te has quedado sin intentos.");
        }

        entrada.close();
    }
}