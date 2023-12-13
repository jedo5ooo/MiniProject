package Model;

public class ShopDTO {

  ////////////////	무기
	public String wname;
	public int atk;
	public int price;
	public String explan;

	public void weapon1(String wname1, int atk1, int price1, String explan1) {
		this.wname = wname1;
		this.atk = atk1;
		this.price = price1;
		this.explan = explan1;
	}


	public void weapon2(String wname2, int atk2, int price2, String explan2) {
		this.wname = wname2;
		this.atk = atk2;
		this.price = price2;
		this.explan = explan2;
	}

	public void weapon3(String wname3, int atk3, int price3, String explan3) {
		this.wname = wname3;
		this.atk = atk3;
		this.price = price3;
		this.explan = explan3;
	}
	/////////////////////방어구
	public String dname;
	public int def;

	public void defensive1(String dname1, int def1, int price4, String explan4) {
		this.dname = dname1;
		this.def = def1;
		this.price = price4;
		this.explan = explan4;
	}
	public void defensive2(String dname2, int def2, int price5, String explan5) {
		this.dname = dname2;
		this.def = def2;
		this.price = price5;
		this.explan = explan5;
	}
	public void defensive3(String dname3, int def3, int price6, String explan6) {
		this.dname = dname3;
		this.def = def3;
		this.price = price6;
		this.explan = explan6;
	}
	/////////////////////포션
	public String hname;
	public int heal;

	public void heal(String hname, int heal) {
		this.hname = hname;
		this.heal = heal;
	}
	
  

}
