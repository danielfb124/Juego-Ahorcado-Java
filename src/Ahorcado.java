import java.util.*;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean adivino = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        while (!adivino && intentos < intentosMaximos) {

            System.out.println("palabra a adivinar: "+ String.valueOf(letrasAdivinadas)+" ("+palabraSecreta.length()+" letras)");
            
            System.out.println("Introduce una letra: ");
            
            char letra = Character.toLowerCase(sc.next().charAt(0));
            
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra;
                    letraCorrecta=true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("letra incorrecta, te quedan "+(intentosMaximos-intentos)+" intentos.");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                adivino=true;
                System.out.println("Felicidades, adivinaste la palabra: "+palabraSecreta);
            }
        }
        if(!adivino){
            System.out.println("se acabaron los intentos, mas suerte la proxima vez");
        }
        sc.close();
    }
}
