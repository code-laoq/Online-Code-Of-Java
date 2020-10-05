package test02;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

	public class task01 {
	   public static void main(String[] args) throws UnsupportedEncodingException{

		   Scanner input = new Scanner(System.in);
		   PrintStream output = new PrintStream(System.out,true,"UTF-8");
		  if( input.hasNextInt()){
			  int a = input.nextInt();
			  output.printf("%d八进制表示:%#o\n",a,a);
			  output.printf("%d十六进制表示:%#x",a,a);
		  }
		  else
			  output.printf("数据输入格式错误，请重新输入");  
	   }
	

}


