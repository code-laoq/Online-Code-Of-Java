/*
学生综合成绩等级评分
【问题描述】利用switch语句根据输入的学生成绩，输出学生综合成绩等级及输出学生的评语。
学生成绩E:<60并且≥0分；D：≥60并且＜70分；C：≥70并且＜80分；B：≥80并且<90分；A：≥90并且≤100分；
学生的等级分为｛”A”, ”B”, ”C”, ”D”,”E”｝
等级A：“成绩优秀，戒骄戒躁，继续保持。”
等级B：“成绩良好，均衡发展各科，争取优异成绩。”
等级C：“成绩较好，提高学习效率，争取良好成绩。”
等级D：“成绩及格，继续努力，争取更好成绩。”
等级E：“成绩不及格，保持良好学习心态，努力学习，争取更好成绩。”
如果给定分数不对，输出“输入的分数不对，请重新输入！
【样例输入】
89
【样例输出】
成绩等级:B
评语:成绩良好，均衡发展各科，争取优异成绩。
【样例输入】
70
【样例输出】
成绩等级:C
评语:成绩较好，提高学习效率，争取良好成绩。
【样例输入】
120
【样例输出】
输入的分数不对，请重新输入！
【样例输入】
-10
【样例输出】
输入的分数不对，请重新输入！
*/

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

