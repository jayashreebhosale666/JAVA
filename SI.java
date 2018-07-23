
import java.util.Scanner;

public class SI{

    public static void main(String[] args) {
       char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("press 'a':for circle area.");
        System.out.println("press 's':for Simple INterest");
        ch=sc.next().charAt(0);
               
        if(ch=='a')
            {
                System.out.println("Enter Radius: ");
                float rad=sc.nextFloat();
                System.out.println("Area: "+(3.14*rad*rad));
            }
       else if(ch=='s')
        {
            System.out.println("Enter Principal amount:");
            float p,n,r;
            p=sc.nextFloat();
            System.out.println("Enter Time in years::");
            n=sc.nextFloat();
            System.out.println("Enter Rate:");
            r=sc.nextFloat();
            System.out.println("Simple Interest is: "+((p*n*r)/100));
        }
            else 
        {
                System.out.println("Something  WRongg!!!!!!!!");
            }
    }
    
}
