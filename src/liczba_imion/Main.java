package liczba_imion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Katarzyna", "Michał", "Krzysztof", "Magdalena");

        long count = imiona.stream()
                .filter(s -> s.length() > 4)
                .peek(System.out::println)
                .count();

        System.out.println("Lista składa się z " + count + " elementów.");
    }
}
