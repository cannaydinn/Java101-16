import java.util.Scanner;

public class CiftSayiBulma{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = sc.nextInt();

        for(int i = 0; i<=sayi;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}