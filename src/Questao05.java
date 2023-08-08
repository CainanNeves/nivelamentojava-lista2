import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        do {
            System.out.println("Digite um número de 1 a 7");
            a = input.nextInt();
            String[] weekDays = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
            if(1<=a&&a<=7)
                System.out.println(weekDays[a-1]);
            else
                System.out.println("Número inválido");

        } while (1 > a | a > 7);

    }
}
