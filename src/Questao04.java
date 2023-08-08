import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        final double MILETOKM = 1.609;

        Scanner input = new Scanner(System.in);
        float mile = input.nextFloat();
        System.out.println(mile * MILETOKM);
    }
}
