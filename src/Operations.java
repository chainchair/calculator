import java.util.*;
public class Operations {
    public static String string=""; //global variables
    public static Scanner scan =new Scanner(System.in); //definition of scan as the scanner
    public static String[] arr;

    private static void entry() {  //the entry() method gets a string whit one operation and modify global string who is used in the operation methods
        System.out.println("enter the expression");
        string =  scan.nextLine(); //get all the line

    }

    public static void sum(){
        entry();
        arr = string.split("\\+"); //split the string when +
        int summed = Arrays.stream(arr).mapToInt(Integer:: parseInt).reduce(0,Integer::sum);
        System.out.println(summed); //return
    }
    public static void subtract(){
        entry();
        arr = string.split("-"); //split the string when "-"
        int subtract = Arrays.stream(arr).mapToInt(Integer:: parseInt).reduce((a,b)->a-b).orElse(0);
        System.out.println(subtract);
    }
    public static void multiplication(){
        entry();
        arr = string.split("\\*"); //split the string when *
        int multiplication = Arrays.stream(arr).mapToInt(Integer:: parseInt).reduce(1,(a,b)->a*b);
        System.out.println(multiplication);
    }
    public static void division(){
        entry();
        arr = string.split("/");
        Double division = Arrays.stream(arr).mapToDouble(Double:: parseDouble).reduce((a,b)->{
            if (b == 0.0) { //catch an 0 and return the division accumulator
                System.out.println("Error: Division by zero is not supported");
                return a;
            } else {
                return a / b;
            }
        }).orElse(Double.NaN); //if the string is void
        System.out.println(division);
    }
}
