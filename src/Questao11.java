import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra1 = input.nextLine();
        String palavra2 = input.nextLine();
        String maiorPalavra;

        if(palavra1.compareTo(palavra2) < 0){
            System.out.println(palavra1+"\n"+palavra2);
        }else{
            System.out.println(palavra2+"\n"+palavra1);
        }

        if(palavra1.length()>palavra2.length()){
            maiorPalavra = palavra1;
        }else{
            maiorPalavra = palavra2;
        }

        System.out.println(maiorPalavra+" tem o maior numero de caracteres");
    }
}
