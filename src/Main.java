import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<=9 ; i++){
            System.out.print(i + " - You need to write down your name: ");
            String name = input.nextLine();

            System.out.println("Hello " + name);
            System.out.println("-*-*-*-*-*-*--*-*-*--*-*-*--*-*-*--*-*");
        }
    }
}
