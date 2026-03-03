package DayTwo;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int original =num;
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+num%10;
            num=num/10;
        }
        if(original==reverse){
            System.out.println("The given number is a Palindrome :"+original);
        }
        else{
            System.out.println("The given number is not a Palindrome :"+original);
        }
    }
}
