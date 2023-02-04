package square;

import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.random());
        }
        System.out.println("10 random numbers:\n" + list);

        Optional<Double> sq = list.stream()
                .map(i -> i * i)
                .reduce((left, right) -> left + right);

        System.out.println("10 random numbers squared and summed:\n" + sq);
    }
}
