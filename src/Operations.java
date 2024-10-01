import java.util.*;
public class Operations {
    public static String string=""; //global variables
    public static Scanner scan =new Scanner(System.in); //definition of scan as the scanner
    public static String[] arr;

    private static void entry() {  //the entry() method changes the value of the global variables a and b to use them in the operation methods
        System.out.println("enter the expression");
        string =  scan.nextLine();

    }

    public static void sum(){
        entry();
        arr = string.split("\\+");
        int summed = Arrays.stream(arr).mapToInt(Integer:: parseInt).reduce(0,Integer::sum);
        System.out.println(summed);
    }
    public static void subtract(){
        entry();
        arr = string.split("-");
        int subtract = Arrays.stream(arr).mapToInt(Integer:: parseInt).reduce((a,b)->a-b).orElse(0);
        System.out.println(subtract);
    }
    public static void multiplication(){
        entry();
        arr = string.split("\\*");
        int multiplication = Arrays.stream(arr).mapToInt(Integer:: parseInt).reduce(1,(a,b)->a*b);
        System.out.println(multiplication);
    }
    public static void division(){
        entry();
        int division = 0;
        System.out.println(division);
    }
}
