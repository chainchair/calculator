import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {

    public static Scanner scan = new Scanner(System.in);
    public static int number;

    public static void show() throws InterruptedException{

        String[] count= new String[]{"three...","two...","one...","Program started..."};
        String[] options= new String[]{"sum","substract","multiply","division"};

        for(String C:count){ //show a decrement counter for the init of the program
            System.out.print(C);
            TimeUnit.SECONDS.sleep(1);
            System.out.print("\r");
        }
        System.out.println("Jd y Samuel");
        for(int i=0;i< options.length;i++){ //shows the options for the user
            System.out.println((i+1)+". "+options[i]);
            TimeUnit.MILLISECONDS.sleep(500);
        }
        Entry();


    }

    public static void Entry(){
        boolean condition=true;
        while(condition){
            System.out.println("select an option");
            number = scan.nextInt();
            switch (number){
                case 1:
                    Operations.sum();
                    break;
                case 2:
                    Operations.subtract();
                    break;
                case 3:
                    Operations.multiplication();
                    break;
                case 4:
                    Operations.division();
                    break;
                case 5:
                    System.out.println("Turning down...");
                    condition=false;
                    break;
                default:
                    System.out.println("Option not suported");
                    condition=false;
                    break;

            }

        }
    }
}
