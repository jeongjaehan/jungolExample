package jungol.exam;

import java.util.Scanner;

/**
 * @author Jeong
 * @since 2013.05.10
 * �簢���׸���1
 */
public class Example1856 implements Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.println(height);
		System.out.print("���� : ");
		int width = sc.nextInt();
		System.out.println(width);
		
		int no = 1;
		
		
		for (int i = 0; i < height; i++) {
			int k = width-1;
			for(int j = 0; j < width; j++){
				
				if(i%2==0){
					System.out.print(no);
				}else{
					System.out.print(no+k);
				}
				
				System.out.print("\t");
				no++;
				k=k-2;
			}
			
			System.out.println();
		}
	}
}
