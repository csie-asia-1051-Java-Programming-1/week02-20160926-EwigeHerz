package ex;
import java.util.*;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021027 陳宴湘
 */

public class ex01_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    int minute = sc.nextInt();
    float dollor = 0;
    float prize = 0.5f;
    if(minute<=600){
    	dollor = minute*prize;
    }
    else{
    	if(minute>600 && minute<=1200){
    		dollor = minute*prize*9/10;
    	}else{
    		
    	}if(minute>1200){
    		dollor = minute*prize*79/100;
    	}
    }
   System.out.print(dollor);
    
	}

}
