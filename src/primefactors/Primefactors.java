package primefactors;

public class Primefactors {

    public static void main(String[] args) {
        long number = 16;
        while (number % 2 == 0) {
            if (number % 2 == 0) {
                System.out.print(2 + " ");
                number = number / 2;
            }
        }
        for (int i = 3; i < number; i += 2) {
            if (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        if (number > 2) {
            System.out.println(number);
        }

    }

}
