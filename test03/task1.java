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
