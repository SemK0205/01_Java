package edu.book.javadoit;

public class Ch4Q5 {
	public static void main(String[] args) {
		
		int i = 1; // 별의 개수
		int j = 0; // 층
		int k = 3; // 공백의 개수
		
		for (j = 1; j > 0 ; j++) {
			
			while ( k > 0 ) {
				System.out.print(" ");
				k--;
			}
			
			while (i > 0) {
				System.out.print("*");
				i--;
			}
			
			System.out.println();
			
			k = 3 - j;
			i = j * 2 + 1;
			
			if(j == 4) {
				i = 5;
				for (j = 3 ; j > 0 ; j-- ) {
					switch(j) {
					case 3 : k = 1;break;
					case 2 : k = 2;break;
					case 1 : k = 3;break;
					}
					while ( k > 0) {
						System.out.print(" ");
						k--;
					}
					while ( i >0 ) {
						System.out.print("*");
						i--;
					}
					System.out.println();
					i = (j-1)*2 - 1;
					
				}
				j = -1;
			}
			
		}
		
	}

}
