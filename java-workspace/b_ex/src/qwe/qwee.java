package qwe;

import java.util.Scanner;

public class qwee {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int moon = 1;
		for(int i =1 ; i<str.length();i++)
		{
			if(str.charAt(i) !=str.charAt(i-1) )
				moon++;
		}
		float size = (float)str.length()/moon;
		System.out.println(size);		
	}

}
