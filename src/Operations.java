import java.util.*;
public class Operations {
    public static int a=0,b=0;
    public static Scanner scan =new Scanner(System.in);

    private static void entry() {  //the entry() method changes the value of the global variables a and b to use them in the operation methods
        System.out.println("enter a, and b statements");
        a =  scan.nextInt();
        b =  scan.nextInt();
    }
    public static void sum(){
        entry();
        int summed = Integer.sum(a,b);
        System.out.println(summed);
    }
    public static void subtract(){
        entry();
        int subtract = a-b;
        System.out.println(subtract);
    }
    public static void multiplication(){
        entry();
        int multiplication = a*b;
        System.out.println(multiplication);
    }
    public static void division(){
        entry();
        if(b==0){
            System.out.println("division by zero");
            return;
        }
        int division = a/b;
        System.out.println(division);
    }
}
