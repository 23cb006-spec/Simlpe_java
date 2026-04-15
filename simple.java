import java.util.*;
public class simple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vote Eligibility");
        System.out.println("Enter Your Age:");
        int n = sc.nextInt();
        if(n>18){
            System.out.print("Eligible");
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}