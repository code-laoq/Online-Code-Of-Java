/*
计算员工薪水
【问题描述】
从控制台输入每月工作天数、每天工作小时数、每小时酬金以及个人所得税，计算得出月薪。结果保留2位小数
月薪 = 工作天数*每天工作小时数*每小时酬金*(1-个人所得税)
【输入格式】
每月工作天数:22
每天的工作小时数:5.5
每小时的酬金:45.5
个人所得税:0.0345
【样例输入】
22
5.5
45.5
0.0345
【样例输出】
月薪:5315.56
*/
package test03;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class task1 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		PrintStream output=new PrintStream(System.out,true,"UTF-8");
		int day;
		float hour,cj,sw,salary;
		
		//output.println("每月工作天数:");
		day=input.nextInt();
		//output.println("每天的工作小时数:");
		hour=input.nextFloat();
		//output.println("每小时的酬金:");
		cj=input.nextFloat();
		//output.println("个人所得税:");
		sw=input.nextFloat();
		
		salary=day*hour*cj*(1-sw);
		
		output.printf("%.2f",salary);
		
	}
	
	

}
