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
