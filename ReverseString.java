import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
         String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
            
        }
        System.out.print(reverse);
    }
}