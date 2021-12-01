import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

public class TestWhileFor {
    public static void main(String[] args) {
        int contador = 1;
        
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Contador saiu com valor: " + contador);

        int contador2 = 1;

        do {
            System.out.println("Valor do contador 2: " + contador2);
        } while( contador2 != 1);

        for(int i = 2; i % 9 != 0; i += 2) {
            System.out.println("Valor do i: " + i);
        }

        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        int menor = arr[0];

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach((number) -> System.out.println("Number " + number));

        for(int i = 0; i < arr.length; i += 1) {
            if(arr[i] < menor) menor = arr[i];
        }

        System.out.println("Menor numero: " + menor);
        System.out.println();

        for(int i = 1; i <= 10; i += 1) {
            for(int j = 1; j <= 10; j += 1) {
                System.out.printf(" %d ", i * j);
            }
            System.out.println();
        }
    }
}
