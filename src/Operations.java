import java.util.*;
public class Operations {


    public static void sum(){
        int a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a, and b statements");
        a =  scan.nextInt();
        b =  scan.nextInt();

        int summed = Integer.sum(a,b);
        System.out.println(summed);
    }
    public static void substract(){
        int a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a, and b statements");
        a =  scan.nextInt();
        b =  scan.nextInt();
        int substract = a-b;
        System.out.println(substract);
    }
    public static void multiplication(){
        int a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a, and b statements");
        a =  scan.nextInt();
        b =  scan.nextInt();
        int multiplication = a*b;
        System.out.println(multiplication);
    }
    public static void division(){
        int a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a, and b statements");
        a =  scan.nextInt();
        b =  scan.nextInt();
        if(b==0){
            System.out.println("division by cero");
            return;
        }
        int division = (int) a/b;
        System.out.println(division);
    }
}
