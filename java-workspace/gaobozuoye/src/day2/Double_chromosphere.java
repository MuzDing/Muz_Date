package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Double_chromosphere {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		getDoubleChromosphere(list);
		System.out.println(list);
	}
	private static List<Integer> getDoubleChromosphere(List<Integer> list) {
		// TODO 自动生成的方法存根
		while(list.size()<6){
			int temp=getNum(1, 33);
			if(!list.contains	(temp)){
				list.add(temp);
			}
			//System.out.print(list.get(list.size()-1)+"  ");
		}
		list.add(getNum(1,16));
		//System.out.println(list.get(list.size()-1)+"  ");
		return list;
	}
	private static int getNum(int low,int high){
		return (int) (Math.random()*high+1);
	}
}
