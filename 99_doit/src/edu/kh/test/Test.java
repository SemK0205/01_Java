package edu.kh.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	
	public void output1() {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; //추가
		
		try {
			
			fos = new FileOutputStream("C:\\workspace\\01_Java\\test.txt");
			bos = new BufferedOutputStream(fos);
			
			StringBuilder str = new StringBuilder();
			
			str.append("안녕하세요!");
			
			String content = str.toString();
			
			bos.write(content.getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				
				fos.close();
				
			} catch (IOException e2) {
				
				e2.printStackTrace();

			}
		}
		
	}

}
