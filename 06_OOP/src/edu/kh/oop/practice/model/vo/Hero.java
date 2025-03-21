package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String nickname; // 닉네임
	private String job; // 직업
	private int hp; // 체력
	private int mp; // 마력
	private int level; // 레벨
	private double exp; // 현재 경험치
	private double sumExp; // 누적 경험치
	
	public Hero() {
		this.sumExp = 0;
	}
	
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.exp = exp;
		this.hp = hp;
		this.job = job;
		this.level = level;
		this.mp = mp;
		this.nickname = nickname;
	}
	
	public void newUser() {
		System.out.println("===========캐릭터 생성===========");
		System.out.println(job+" 직업으로'"+nickname+"'님이 생성되었습니다.");
		System.out.println("현재 레벨 : "+level);
		System.out.println("현재 hp : "+hp);
		System.out.println("현재 mp : "+mp);
		System.out.println("현재 경험치 : "+exp);
	}
	
	public void attack(double exp) {
		this.exp += exp;
		sumExp += exp;
		System.out.println("'"+nickname+"'"+"은/는 공격을 했다!!! 현재 경험치 : "+this.exp);
		if( this.exp >= 300) {
			level++;
			System.out.print("레벨이 올랐습니다!! 현재레벨 : "+level);
			this.exp -= 300;
		}
		System.out.print("  (누적 경험치량 : "+sumExp+")\n");
	}
	
	public void dash() {
		if(this.mp>0) {
			this.mp -=10;
			System.out.println("'"+nickname+"'"+"의 엄청 빠른 대시!!! 남은 마력 : "+mp);
		} else {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");
		}
	}
	
	/*
	public String toString() {
		System.out.println("======='"+nickname+"'님의 정보=======");
		return "- 현재 레벨 : "+level+"\n- 현재 hp : "+hp+"\n- 현재 mp : "+mp+"\n- 현재 exp : "+exp+"\n- 누적 exp : "+sumExp;
	}
	*/

	@Override
	public String toString() {
		return "- 현재 레벨 : "+level+"\n- 현재 hp : "+hp+"\n- 현재 mp : "+mp+"\n- 현재 exp : "+exp+"\n- 누적 exp : "+sumExp;
	}
	
	
	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	
}
