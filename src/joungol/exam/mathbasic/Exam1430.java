package joungol.exam.mathbasic;

/**
 * 숫자의 개수
 * http://www.jungol.co.kr/prog/Hanal/hanalView.php?qs_code=1430&qlevel=4&sk=&sv=&menu=&qc=42&sst=qs_code&sod=asc&page=1
 * @author Jeong
 */
public class Exam1430 {
	public static void main(String[] args) {
		int A = 150 ,B = 266, C = 427;
		
		int SUM = A * B * C;
		
		String S_SUM = String.valueOf(SUM);
		
		int results[][] = new int[10][2];
		
		for(int i=0; i<results.length; i++){
			results[i][0] = i;
		}
		
		for(int i=0; i<S_SUM.length(); i++){
			String c =Character.toString(S_SUM.charAt(i));
			results[Integer.parseInt(c)][1]++;
		}
		
		
		for(int i = 0; i<results.length; i++){
			System.out.println(results[i][1]);
		}
	}
}
