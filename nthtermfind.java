import java.util.*;
import java.util.Scanner;
public class nthtermfind {
    public static void main(String[] args) {
        System.out.println("enter a no:- ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1){
            int tm=(n+1)/2;
            int result=Math.pow(2, tm-1);
           System.out.println(result);
        }
        else{
          int tm=n/2;
           int result=Math.pow(2,tm-1);
            System.out.println("result"+result);
        }


    }
    
}
