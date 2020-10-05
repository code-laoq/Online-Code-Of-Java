package test03;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.math.*;
public class task4 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		PrintStream output=new PrintStream(System.out,true,"UTF-8");
		
		if(input.hasNextInt())
		{
			int m=0,n=input.nextInt();
						
			if(n>2 && n<=10000)
			{
				for(int i=2; i<=n; i++)
				{
					boolean flag=true;
					for(int j=2; j<i; j++)
					{
						if(i%j==0)
						{
							flag=false;
						}
					}
					if(flag==true)
					{
						if(m++%15==0)
							System.out.printf("\n");
						System.out.printf("%5d",i);
					}
				}
			}
			else
				output.println("用户输入数字超过范围，请重新输入。");
		}
		else
			output.println("用户输入数据格式错误，请重新输入。");
		
		 
	}

}
