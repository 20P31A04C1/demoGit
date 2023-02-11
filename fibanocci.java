import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,count=3;
        n=sc.nextInt();
        while(count<=n)
        {
				c=a+b;
        a=b;
        b=c;
        count++;
        System.out.print(c+" ");
        }
        sc.close();
        
        
    }
}