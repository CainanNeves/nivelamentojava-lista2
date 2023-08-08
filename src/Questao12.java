import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, litro, kmTotal = 0, litroTotal = 0;
        float kml;
        do {
            km = input.nextInt();
            litro = input.nextInt();
            if(km!=0 && litro!=0){
                kmTotal += km;
                litroTotal += litro;
                kml = (float) km / (float) litro;
                System.out.println("Km/l = " + kml);
                System.out.println("Total de Km até agora = " + kmTotal);
                System.out.println("Totam de Combustivel consumido até agora = " + litroTotal);
            }
        }while(km != 0 && litro != 0);
    }
}
