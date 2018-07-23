import java.util.Scanner;

public class CharCheck{

    public static void main(String[] args) {
       char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character: ");
        ch=sc.next().charAt(0);
        if(ch>=65 && ch<=90 || ch>=97&&ch<=122)
            {
                System.out.println("Alphabet"); 
            }
       else if(ch>=48&&ch<=57)
        {
            System.out.println("Number");
        }

            else 
        {
                System.out.println("special character");
            }
    }
    
}