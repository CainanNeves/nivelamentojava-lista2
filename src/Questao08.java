import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().toLowerCase();
        StringBuilder b = new StringBuilder(a);
        String reverse = b.reverse().toString();
        boolean palindromo = true;
        if(a.equals(reverse))
            System.out.println("É um palíndromo");

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length()-1-i)) {
                palindromo = false;
                break;
            }
        }
        if(palindromo) System.out.println("É um palíndromo");
        else System.out.println("Não é um palíndromo");
    }
}
