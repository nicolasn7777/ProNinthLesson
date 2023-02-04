package calculate;

public class Main {

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> x / y;
        Operation mul = (x, y) -> x * y;


        try {
            int resultDiv = div.calculate(110, 11);
            System.out.println(resultDiv);
        } catch (Exception e) {
            System.out.println("ERROR!/by zero");
        }
        int resultAdd = add.calculate(20, 230);
        int resultSub = sub.calculate(40, 50);
        int resultMul = mul.calculate(56, 45);

        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultMul);
    }
}
