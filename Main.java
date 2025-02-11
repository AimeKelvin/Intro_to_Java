import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //create Variable scanner
    Scanner scanner = new Scanner(System.in);

    int age;

System.out.println("Whats your age: ");
age= scanner.nextInt();

     if(age < 18){
        System.out.println("You are a kid lil bro");
     }else if(age >= 18){
        System.out.println("Jojo POSE POSE POSE.");
     }

    

    }
}
