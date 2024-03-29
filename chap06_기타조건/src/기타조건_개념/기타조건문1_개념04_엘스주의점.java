package 기타조건_개념;

import java.util.Random;

public class 기타조건문1_개념04_엘스주의점 {
	public static void main(String[] args) {
		
		/*
	        [else 주의점]
	            else 는 if 문 한개만 연결이 된다. 아래와 같은 상황을 조심해야 한다.
	            
	        [문제]
	            랜덤으로 1~5 사이의 숫자를 저장한다. 
	            1이면 "아메리카노" 출력
	            2이면 "까페라떼" 출력
	            3이면 "모카라떼" 출력
	            그 외는 "기타"를 출력
		*/
	
	    /*
	        [설명]
	            랜덤값이 1 이나 2일 때를 살펴보면 메세지가 두 개가 출력이 된다. 
	            else는 if 한개만 연결되기 때문에 경우의 수가 두 개일 때만 사용한다. 
	            경우의 수가 3개 이상일경우에대해선 다음단원에서 배운다.
	    */
		Random ran = new Random();
	
	    int num = 0;
	    
	    num = ran.nextInt(5) + 1;
	    num = 2; // 설명을 위해 임의로 2를 저장한다. 
	
	    if(num == 1) {
	        System.out.println("아메리카노");
	    }
	    if(num == 2) {
	        System.out.println("까페라떼");
	    }
	    if(num == 3) {
	        System.out.println("모카라떼");
	    }
	    else {
	        System.out.println("기타");
	    }
		
	}
}
