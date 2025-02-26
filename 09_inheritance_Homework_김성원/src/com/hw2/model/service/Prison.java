package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners;	// 전체 수용자 저장용 배열
	private int prisonerCount;		// 수용자수
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	
	@Override
	public void addPerson(Person person) {
		for(int i = 0; i < prisoners.length ; i++) {
			if(prisoners[i]!= null) {
				prisonerCount++;
				break;
			}
		}
		if(prisonerCount<10) {
			prisoners[prisonerCount] = (Prisoner) person;
			System.out.println("수감자가 추가되었습니다 - "+person.getInfo());
		}else {
			System.out.println("인원이 모두 충원되었습니다.");
		}
	}

	@Override
	public void removePerson(String id) {
		boolean flag = true;
		for(int i = 0; i < prisoners.length ; i++) {
			if(prisoners[i].getId().equals(id)) {
				System.out.println("수감자가 삭제되었습니다 - "+prisoners[i].getInfo());
				prisoners[i] = null;
				flag = false;
				break;
			}
		}if(flag) {
			System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
			
		}
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		for(int i = 0 ; i < prisoners.length ; i++) {
			if(prisoners[i] == null) {
				continue;
			}
			System.out.println(prisoners[i].getInfo());
		}
	}

	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

}
