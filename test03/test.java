package test03;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc=new Scanner(System.in);
		PrintStream ps=new PrintStream(System.out,true,"UTF-8");
		if(sc.hasNextInt())
		{
			int n=sc.nextInt();	
			if(n>10000 || n<2)
			{
				ps.print("用户输入数字超过范围，请重新输入。");
			}
			else 
			{
				for(int i=2;i<=n;i++)
				{
					int j;
					int a=0;
					for(j=2;j<=Math.sqrt(i);j++)
						{
							if (i % j == 0) break;
						}
					if (j > Math.sqrt(i))                                     
					{
						a++;
						ps.printf("%5d",i); 
						ps.printf("a=%5d",a);
						if(a%15==0) 
						{
							ps.printf("\n");
						}
					}
					
				}
			}
		}
		else 
		{
			ps.print("用户输入数据格式错误，请重新输入。");
		}
	}
}