package day1;

public class question_3 {

	public static void main(String[] args) {
		// 求水仙花数
		int x, y, z;
		for (int i = 1; i < 1000; i++) {
			if (i < 10) {
				System.out.println(i);
			} else if (i >= 10 && i < 100) {
				int b = (int) (Math.pow(i % 10, 2) + Math.pow(i / 10, 2));
				if (i == b) {
					System.out.println(i);
				}
			} else {
				int b = (int) (Math.pow(i % 10, 3) + Math.pow(i / 10 % 10, 3) + Math.pow(i / 100, 3));
				if (i == b) {
					System.out.println(i);
				}
			}

		}
	}

}
