import java.util.Scanner;

public class useinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<5)
            System.out.println("you are too young");
        else;
        if(age<=18)
            System.out.println("just right");
        else{
            System.out.println("old");
        }
        sc.close();
    }
}
