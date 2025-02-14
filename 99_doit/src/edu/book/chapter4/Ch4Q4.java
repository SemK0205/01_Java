package edu.book.chapter4;

public class Ch4Q4 {
	public static void main(String[] args) {
		
		int i = 1; // 별의 개수 i * 2 -1
		int j = 0; // 층 
		int k = 3; // 공백의 개수
		
		for ( j = 1 ; j < 5 ; j++) {
			
			while ( k > 0 ) {
				System.out.print(" ");
				k--;
			}
			
			while ( i > 0 ) {
				System.out.print("*");
				i--;
			}
			System.out.println();
			
			k = 3 - j;
			
			i = j * 2 + 1;
			
		}
		
		
	}

}
