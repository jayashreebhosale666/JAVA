import java.util.Scanner;

public class Greater{

    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>n2)
        {
            System.out.println(n1+"is greater.");
        }
        else
            if(n1<n2)
            {
                System.out.println(n2+" is greater."); 
            }
        else
            {
                System.out.println(n1+" Both values are same "+n2);
            }
    }
    
}
