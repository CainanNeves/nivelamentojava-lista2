import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().toLowerCase();
        char ch;
        int vog = 0, spaces = 0, conso = 0;
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            if(ch == ' '){
                spaces++;
            } else if (isVogal(ch)) {
                vog++;
            }else{
                conso++;
            }
        }
        System.out.printf("Vogais = %d\nConsoantes = %d\nEspaços = %d\n", vog, conso, spaces);
    }

    public static boolean isVogal(char c){
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (char v: vogais) {
            if(c == v) return true;
        }
        return false;
    }
}
