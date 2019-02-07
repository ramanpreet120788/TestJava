import java.util.Scanner;

public class index {

public static void main( String[] args )
    {
 int a=1;
        int b=2;
        System.out.println("Enter how many numers you want to print"); 
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Printing the read line 
        System.out.println(number);  
        System.out.println(a);	
        System.out.println(b);	
        for(int i=0;i<number;++i)
        {
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
}

}