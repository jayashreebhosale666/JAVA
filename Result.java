import java.util.Scanner;

public class Result{

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        float per=(n1+n2+n3)/3;
        if(per<40)
        {
            System.out.println("Im very happy for u that u are fail!!!.");
        }
        else if(per>=40 &&per<60)
            {
                System.out.println("Pass"); 
            }
            else if(per>=60&&per<70)
            {
                System.out.println("First Class");
            }
            else if(per>=70&&per<90)
            {
                System.out.println("Desitnction");
            }
            else if(per>=90&&per<=100)
            {
                System.out.println("OMG u are Excellent");
            }
    }
    
}
