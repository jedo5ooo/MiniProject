package Model;

public class PlayerDTO {
	private int str; // 케릭터 힘
	private int hp; // 케릭터 hp
	private int skill; // 케릭터 skill

	private int monster1Str;
	private int monster1hp;

	private int monster2Str;
	private int monster2hp;

	private int monster3Str;
	private int monster3hp;

	private int monster4Str;
	private int monster4hp;

	///////////////////////// 생성자

	public PlayerDTO(int str, int hp, int skill, int monster1Str, int monster1hp, int monster2Str, int monster2hp,
	         int monster3Str, int monster3hp, int monster4Str, int monster4hp) {
	      super();
	      this.str = str;
	      this.hp = hp;
	      this.skill = skill;
	      this.monster1Str = monster1Str;
	      this.monster1hp = monster1hp;
	      this.monster2Str = monster2Str;
	      this.monster2hp = monster2hp;
	      this.monster3Str = monster3Str;
	      this.monster3hp = monster3hp;
	      this.monster4Str = monster4Str;
	      this.monster4hp = monster4hp;
	   }

	// 캐릭터
	public PlayerDTO(int str, int hp) {
	      this.str = str;
	      this.hp = hp;
	   }
	// 몬스터1

	public void characterDTO1(int monster1Str, int monster1hp) {
		this.monster1Str = monster1Str;
		this.monster1hp = monster1hp;
	}

	// 몬스터2
	public void characterDTO2(int monster2Str, int monster2hp) {
		this.monster2Str = monster2Str;
		this.monster2hp = monster2hp;
	}

	// 몬스터3
	public void characterDTO3(int monster3Str, int monster3hp) {
		this.monster3Str = monster3Str;
		this.monster3hp = monster3hp;
	}

	// 몬스터4
	public void characterDTO4(int monster4Str, int monster4hp) {
		this.monster4Str = monster4Str;
		this.monster4hp = monster4hp;
	}

	//////////////// get set
	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMonster1Str() {
		return monster1Str;
	}

	public void setMonster1Str(int monster1Str) {
		this.monster1Str = monster1Str;
	}

	public int getMonster1hp() {
		return monster1hp;
	}

	public void setMonster1hp(int monster1hp) {
		this.monster1hp = monster1hp;
	}

	public int getMonster2Str() {
		return monster2Str;
	}

	public void setMonster2Str(int monster2Str) {
		this.monster2Str = monster2Str;
	}

	public int getMonster2hp() {
		return monster2hp;
	}

	public void setMonster2hp(int monster2hp) {
		this.monster2hp = monster2hp;
	}

	public int getMonster3Str() {
		return monster3Str;
	}

	public void setMonster3Str(int monster3Str) {
		this.monster3Str = monster3Str;
	}

	public int getMonster3hp() {
		return monster3hp;
	}

	public void setMonster3hp(int monster3hp) {
		this.monster3hp = monster3hp;
	}

	public int getMonster4Str() {
		return monster4Str;
	}

	public void setMonster4Str(int monster4Str) {
		this.monster4Str = monster4Str;
	}

	public int getMonster4hp() {
		return monster4hp;
	}

	public void setMonster4hp(int monster4hp) {
		this.monster4hp = monster4hp;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

}
