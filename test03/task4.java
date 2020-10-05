/*
输出指定范围内的素数
【问题描述】
用户输入数字n(n＞2且n≤10000)
程序输出2-n以内所有的素数(素数之间用%5d隔开，每15个素数换一行)
【样例输入】
ssss
【样例输出】
用户输入数据格式错误，请重新输入。
【样例输入】
10001
【样例输出】
用户输入数字超过范围，请重新输入。
【样例输入】
6
【样例输出】
     2     3     5
【样例输入】
120
【样例输出】
    2    3    5    7   11   13   17   19   23   29   31   37   41   43   47
   53   59   61   67   71   73   79   83   89   97  101  103  107  109  113
*/

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
