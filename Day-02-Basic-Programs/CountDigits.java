package DayTwo;
import java.util.Scanner;

public class CountDigits {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    int count=0;
    int lastdigit=0;
    while(num!=0){
        lastdigit=num%10;
        count++;
        num=num/10;
    }
    System.out.println("Number of digits in the given number is:"+count);
   } 
}
