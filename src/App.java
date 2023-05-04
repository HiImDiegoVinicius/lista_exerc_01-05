import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a Quantidade em Metros: ");
        double metros = input.nextDouble();
        input.close();
        double cm = metros * 100;
        System.out.println("Valor em Centímentros: " + cm); 

    }
}
