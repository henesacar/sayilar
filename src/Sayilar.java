import java.util.Scanner;

public class Sayilar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 0, j = 0, data;
        do {
            System.out.println("Lütfen bir sayı girin :");
            data = scn.nextInt();
            if (data % 2 == 1) {
                System.out.println("Tek sayı girdiniz.");
                System.out.println("Girdiğiniz çift sayı olan ve aynı zamanda 4'e bölünen sayılar toplamı: " + i);
                break;
            } else if (data % 2 == 0 && data % 4 == 0) {
                i += data;

            }

        } while (data > 0);

    }
}
