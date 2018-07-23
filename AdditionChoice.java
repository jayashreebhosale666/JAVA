import java.util.Scanner;
public class AdditionChoice{

    public static void main(String[] args) {
       char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("press 'a':for Addition.");
        //System.out.println("press 's':for Simple INterest");
        ch=sc.next().charAt(0);
               
        if(ch=='a')
            {
                System.out.println("Enter Number: ");
                float n1=sc.nextFloat();
                System.out.println("Enter Number: ");
                float n2=sc.nextFloat();
                System.out.println("Addition: "+(n1+n2));
            }
          else 
        {
                System.out.println(" WRongg!!!!!!!! choice");
            }
    }
    
}
