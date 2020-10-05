/*
【问题描述】从输入端接收用户输入一个小数，输出该数的整数部分。如果用户输入的不是小数，则输出用户输入数据格式不正确，请重新输入
【样例输入】c
【样例输出】用户输入数据格式不正确，请重新输入

【样例输入】12.1
【样例输出】12

【样例输入】12.6
【样例输出】12
*/
package test02;
import java.util.*;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
public class task02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		PrintStream output = new PrintStream(System.out,true,"UTF-8");
		
		if(input.hasNextDouble())
		{
			double i=input.nextDouble();
			int j=(int)i;
			System.out.print(j);
		}
		else
		{
			output.print("用户输入数据格式不正确，请重新输入");
		}
	}

}
