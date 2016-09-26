package hw;
import java.util.*;
/*
 * Topic: 已知男生標準體重＝(身高－80 )0.7；女生標準體重＝(身高－70)0.6；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021027 陳宴湘
 */
public class hw02_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入性別(男生為1,女生為2):");
	    int x = sc.nextInt();
	    System.out.print("請輸入身高:");
	    float h = 0;
	    float t1 = sc.nextFloat();
	    
	  
	    		if(x==1){
	    			h = (t1-80)*7/10;
	    			System.out.print(h);
	    		}
	    			if(x==2){
	    				h = (t1-70)*6/10;
	    				System.out.print(h);
	    			}
	    			
	    		}
	    	
	    }
	
