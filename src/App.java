import java.util.*;

public class App {
    public static void main(String[] args) {
        String[] letras1 = new String[] { "morango", "uva", "acerola", "manga" };
        String[] letras2 = new String[] { "acerola", "caju", "morango", "kiwi" };

        List<String> frutasRepetidas = new ArrayList<>();
        for (int i = 0; i < letras1.length; i++) {
            for (int j = 0; j < letras2.length; j++) {
                if (letras1[i] == letras2[j]) {
                    frutasRepetidas.add(letras1[i]);
                }
            }
        }
        System.out.println(frutasRepetidas);
    }
}
