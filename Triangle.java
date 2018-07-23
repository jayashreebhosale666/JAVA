

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
       
        if(n1==n2 && n1==n3)
            {
                System.out.println("Equilateral triangle");
            }
 	else if(n1==n2||n2==n3||n1==n3)
        {
            System.out.println("isosceles triangle");
        }
        else
            else 
        	{
                System.out.println("Scalene triangle");
            }
    }
    
}
