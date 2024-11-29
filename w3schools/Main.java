public class Main {
public static void main(String[] args){

int items = 50;
float costPerItems = 9.90f;
float totalCost = items * costPerItems;
String currency = "Frw";

//Print variables 
System.out.println("Number of items: " + items);
System.out.println("Cost per item: "+ costPerItems + currency);
System.out.println("Total cost = " + totalCost + currency);
 
}
}