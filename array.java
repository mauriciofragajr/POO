package array;

import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String frase = in.nextLine();

        //List<String> lista = new ArrayList<>(Arrays.asList(frase.split(" ")));
        String[] lista = frase.split(" ");

        Map<String, Integer> myMap = new HashMap<>();

        for (String s : lista) {
            if (myMap.containsKey(s)) {
                int x = myMap.get(s);
                x++;
                myMap.put(s, x);

            } else {
                myMap.put(s, 1);
            }
        }

        for (String k : myMap.keySet()) {
            System.out.println(k + " : " + myMap.get(k));
        }

    }

}
