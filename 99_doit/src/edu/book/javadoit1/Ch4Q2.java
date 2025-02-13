package edu.book.javadoit1;

public class Ch4Q2 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for (i=1; i<10 ; i++) {
			if(i%2!=0) {
				continue;
			}
			for(j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
		
	}

}
