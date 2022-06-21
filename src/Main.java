import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int diziBoyut = scanner.nextInt();
        int[] dizi = new int[diziBoyut];
        for (int i = 0; i < diziBoyut; i++) {
            System.out.print("Dizinin " + i + ". elemanini giriniz: ");
            dizi[i] = scanner.nextInt();
        }
        for(int i : dizi){
            System.out.print(i+" ");
        }

        for(int i = 0; i<diziBoyut;i++){
            for(int j = 0;j<diziBoyut;j++){
                if(dizi[j]>dizi[i]){
                    int tmp= dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]=tmp;
                }
            }
        }
        System.out.println();
        for(int i : dizi){
            System.out.print(i+" ");
        }
    }
}
