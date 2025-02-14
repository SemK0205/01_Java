package edu.book.chapter4;

public class Ch4Q3 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 1;
		//2중 for문 활용
		for ( i = 2 ; i < 10 ; i++) {
			for ( j = 1; j < 10 ; j++) {
				if(i < j) {
					continue;
				}
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		System.out.println();
		
		//for구문과 while 구문 활용
		for ( i = 2; i < 10 ; i++) {
			j=1;
			while(i>=j) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
				j++;
			}
		}
		
	}

}
