/*
【问题描述】用户输入圆的半径r的值（默认用户输入的是合法的数字），pi默认为3.14填补代码，最后输出圆的面积（小数点后保留2位）
【样例输入】3
【样例输出】28.26
【样例输入】1.5
【样例输出】7.07
*/
package test02;
import java.util.*;
public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  Scanner  input= new  Scanner(System.in);
			  double  r =input.nextDouble();	                  
			  float  pi = 3.14f; 
			  double area = pi*r*r;
			  System.out.printf("%.2f",area);    
			    
			  }
	

}
