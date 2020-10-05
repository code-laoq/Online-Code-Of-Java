package test03;
import java.util.*;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
public class task3 {


		public static void main(String[] args) throws UnsupportedEncodingException {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			PrintStream output=new PrintStream(System.out,true,"UTF-8");
			
			float score = input.nextFloat();
			
			if(score<0 || score >100)
				output.println("输入的分数不对，请重新输入！");
				else 
					switch((int)score/10)
					{
					case 10:
					case 9:output.println("成绩等级:A\n成绩优秀，戒骄戒躁，继续保持。");break;
					case 8:output.println("成绩等级:B\n评语:成绩良好，均衡发展各科，争取优异成绩。");break;
					case 7:output.println("成绩等级:C\n评语:成绩较好，提高学习效率，争取良好成绩。");break;
					case 6:output.println("成绩等级:D\n评语:成绩及格，继续努力，争取更好成绩。");break;
					default:output.println("成绩等级:A\n评语:成绩不及格，保持良好学习心态，努力学习，争取更好成绩。");
					}
			
				
		}

	}

