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
