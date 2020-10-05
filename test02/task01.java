/*
【问题描述】用户输入一个整数，输出这个整数的8进制表示和16进制表示。如果用户输入的不是整数，则提示用户：数据输入格式错误，请重新输入。
【样例输入】103
【样例输出】103八进制表示:0147
	    103十六进制表示:0x67
【样例输入】19.23
【样例输出】数据输入格式错误，请重新输入
【样例输入】98
【样例输出】98八进制表示:0142
            98十六进制表示:0x62
*/
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


