package chap15_usefulClass;

		//Math.max와 Math.min을 이용하여 
		//최소값, 최대값 구하기
		import java.util.Scanner;

		public class _17_mathEx {

		   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      int arr[] = new int[5];
		      
		      int max = 0; // 최대값
		      
		      for(int i = 0; i < arr.length; i++) {
		         System.out.printf("%d번째 정수 입력 > ", i+1);
		         arr[i] = sc.nextInt();
		      }													//5번쨰 까지 
		            
		      max = arr[0];										//현재 최대값에 1번쨰 숫자를 대입
		      
		      for(int i = 0; i < arr.length; i++) {				//int(정수) 0~4(5번째) 숫자까지 대입 
		         max = Math.max(max, arr[i]);					//현재 최대값과 1씩 더한 값의 크기 비교
		      }
		      
		      System.out.println("최대값 : " + max);				//
		      
		      sc.close();
		   }
		}

		
}
