import java.util.Scanner;
public class elmas {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int sayi = klavye.nextInt();


        for (int i = 0; i <= sayi ; i++) {
            for(int k=0; k<(sayi-i); k++)
            System.out.print(" ");

            for(int m=1; m<=(2*i+1); m++)
            System.out.print("*");

            System.out.println(" ");
        }

        for (int i=0; i<=sayi; i++) {
            for(int j=0; j<(i+1); j++)
              System.out.print(" ");

            for (int k=1; k<2*(sayi-i); k++) 
              System.out.print("*");
            System.out.println(" ");
        }



    }
    
}
