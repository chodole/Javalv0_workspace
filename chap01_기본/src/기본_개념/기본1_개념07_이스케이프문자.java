package 기본_개념;

public class 기본1_개념07_이스케이프문자 {
	public static void main(String[] args) {
		
		/*
			이스케이프 문자 \
			
			(1) \알파벳 = 기능
			(2) 종류
				[1] \n = new line(줄바꿈)
				[2] \t = tab
				[3] \"
				[4] \'
				[5] \\
		 */
		System.out.println("안녕\n하세요.");
		System.out.println("안녕\t하세요.");
		System.out.println("\"Hi\"");
		System.out.println("\'Hi\'");
		System.out.println("\\");
	}
}
