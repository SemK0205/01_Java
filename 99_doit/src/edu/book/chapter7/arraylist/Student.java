package edu.book.chapter7.arraylist;

import java.util.ArrayList;

public class Student {
	int StudentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언하기
	
	public Student(int studentID, String studentName) {
		this.StudentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // Subject 과목 생성
		subject.setName(name);	// 과목 이름 추가하기
		subject.setScorePoint(score); // 점수 추가하기
		subjectList.add(subject); //배열에 저장하기
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint(); // 총점 더하기
			System.out.println("학생 "+studentName + "의 "+ s.getName()+" 과목 성적은 "+s.getScorePoint()+"입니다.");
		}
		
		System.out.println("학생 "+studentName + "의 총점은"+ total+" 입니다.");
		
	}

}
