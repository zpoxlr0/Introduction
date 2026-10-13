import java.util.Scanner;
public class bouclerofr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int somme =0;
        for(int i =0; i<5 ;i++){
            int nb=sc.nextInt();
            somme=somme+nb;
        }
        System.out.println(somme);
        sc.close();
    }
}
