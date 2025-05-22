package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[5];



        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Hinata";
        System.out.println("\nO array foi guardado nesse slot de memória: " + ninjas + "\n");

        System.out.println("\n");

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {
                break;
            }
            System.out.println(ninjas[i]);
        }



    }
}
