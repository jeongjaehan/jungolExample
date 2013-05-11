package jungol.exam.level2;

import java.util.Scanner;

/**
 * 사각형그리기2
 * @author Jeong
 * @since 2013.05.10
 * @see link http://www.jungol.co.kr/prog/Hanal/hanalView.php?qs_code=1523&qlevel=4&sk=&sv=&menu=&qc=41&sst=qs_code&sod=asc&page=1
 */
public class Example2046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n :");
		int n = sc.nextInt();
		System.out.println("m :");
		int m = sc.nextInt();
		
		if(m >= 1 && m <= 3){
			switch (m) {
			case 1:
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						System.out.print(i+1);
						System.out.print(" ");
					}
					System.out.println();
				}
				
				break;
				
			case 2:
				for(int i = 0; i < n; i++){
					
					if(i%2==0){
						for(int j = 0; j < n; j++){
							System.out.print(j+1);
							System.out.print(" ");
						}
					}else{
						for(int j = n; j > 0; j--){
							System.out.print(j);
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
				break;
				
			case 3:
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						System.out.print((i+1) * (j+1));
						System.out.print(" ");
					}
					System.out.println();
				}
				
				break;

			default:
				break;
			}
		}else{
			System.out.println("종류는 1보다 크고 3보다 작아야한다.");
		}
		
	}
}
