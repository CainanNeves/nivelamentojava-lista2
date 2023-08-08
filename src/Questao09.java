import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float raio = input.nextFloat();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println(Math.floor(area));
    }
}
