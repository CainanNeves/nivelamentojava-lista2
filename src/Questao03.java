import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 1; i <= a; i++){
            if(isPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimo(int x){
        int divisores = 0;

        for (int i = 1; i <= x; i++){
            if(x % i == 0)
                divisores++;
        }
        return (divisores == 2);
    }
}
