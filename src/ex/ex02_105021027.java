package ex;
import java.util.*;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021027 陳宴湘
 */

public class ex02_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
  
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x*x+y*y>10000){
       System.out.print("範圍外");
       }else{
    	   if(x*x+y*y<=10000){
    		   System.out.print("範圍內");
    	   }
       }
	}

}
