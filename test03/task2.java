/*
判断闰年
【问题描述】判断用户输入的年份是否为闰年。
闰年要求：如果年份可以被 4 整除而不能被 100 整除， 或者可以被 400 整除， 那么该年就是闰年。提示：用户输入年份只为(1900-2200年)
【样例输入】
2000
【样例输出】
2000年是闰年
【样例输入】
2001
【样例输出】
2001年是平年
【样例输入】
30000
【样例输出】
该年份不存在，请重新输入
【样例输入】
ssss
【样例输出】
用户输入格式错误，请重新输入
*/

package test03;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class task2 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		PrintStream output=new PrintStream(System.out,true,"UTF-8");
		
		
		if(input.hasNextInt())
		{
			int year=input.nextInt();
				if(year>=1900 && year<=2200)
		{
			if(year%4==0 && year%100!=0 || year%400==0)
				output.print(year+"年是闰年");
			else 
				output.print(year+"年是平年");
		}
				else
					output.print("该年份不存在，请重新输入");	
		}
		else
		{
				output.print("用户输入格式错误，请重新输入");
		}
		
	}

}
