package Model;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
//	      캐릭터 힘, hp, skill // 몬스터1 힘, hp //몬스터2 힘, hp // 몬스터3 힘, hp // 몬스터4 힘, hp
		PlayerDTO dto = new PlayerDTO(10, 100, 20, 5, 22, 3, 15, 5, 20, 7, 40);

		System.out.println("게임을 시작합니다.");

		int stage = 1; // 게임스테이지(1~4)
		int select = 0; // 선택지

		System.out.println("====현재 케릭터 상태====");
		System.out.println("힘 : " + "[" + dto.getStr() + "]");
		System.out.println("HP : " + "[" + dto.getHp() + "]");
		while (true) {
			System.out.print("모험하러 떠나시겠습니까? (Y / N) ");
			String answer = sc.next(); // 이동 대답

			if (answer.equals("Y") || answer.equals("y")) {
				while (true) {
					System.out.println("어디로 이동하시겠습니까?");
					System.out.print("[1] 사냥터" + "\t" + "[2] 상점 ");
					select = sc.nextInt();
					if (select == 1) {
						System.out.println("***사냥 팁 : 주사위가 1이 나올 경우 사냥없이 보상을 얻습니다.***");
						System.out.print("스테이지를 선택해 주세요 [1] [2] [3] [4] ");
						select = sc.nextInt();
						if (select == 1) {
//	               스테이지 1
							System.out.println("이동을 위해 주사위를 굴려주세요");
							int dice = ran.nextInt(4) + 1; // 랜덤 주사위
							System.out.println("주사위는 : " + dice + "이 나왔습니다");
							//////////////////////////////////// 모험시작 몬스터 사냥 주사위 굴림
							if (dice == 1) {
								System.out.println("축하드립니다 !! 숫자 1이 나왔습니다");
								System.out.println(stage + "스테이지 종료");
								System.out.print("[1] 스테이지로 이동" + "\t" + "[2] 메인화면으로 이동 ");
								select = sc.nextInt();
							} else {
								System.out.println("몬스터를 만났습니다.");
								System.out.println("====현재 케릭터 상태====");
								System.out.print("힘 : " + "[" + dto.getStr() + "]" + "\t");
								System.out.println("HP : " + "[" + dto.getHp() + "]");
								System.out.println("====몬스터 상태====");
								System.out.print("힘 : " + "[" + dto.getMonster1Str() + "]" + "\t");
								System.out.println("HP : " + "[" + dto.getMonster1hp() + "]");
								System.out.print("[1] 싸운다" + "\t" + "[2] 도망간다 ");
								select = sc.nextInt();
								if (stage == 1) {
									int a = 1; // 스킬횟수
									int b = dto.getMonster1hp(); // 몬스터 Hp
									int c = dto.getHp(); // 캐릭터 Hp
//	                     몬스터와 싸움
									while (true) {
										
										System.out.println("어떤공격을 하시겠습니까 ? ");
										System.out.print("[1] 일반공격 공격력 -> " + dto.getStr() + "\t" + "[2] 스킬공격 공격력 -> "
												+ dto.getSkill() + "  잔여횟수 : " + "[1 / " + a + "]");
										select = sc.nextInt();
										if (select == 1) {
											System.out.println("****일반 공격을 했다!! 데미지 : " + dto.getStr());
											System.out.println("몬스터 상태");
											b -= dto.getStr(); // 몬스터 잔여 체력
											System.out.print("힘 : " + "[" + dto.getMonster1Str() + "]" + "\t");
											System.out.println("캐릭터 상태");
											System.out.println("HP : " + "[" + b + "]");

										} else if (select == 2) {
//	                           스킬공격
											if (a > 0) {
												System.out.println("****스킬 공격을 했다!! 데미지 : " + dto.getSkill());
												System.out.println("몬스터 상태");
												b -= dto.getSkill(); // 몬스터 잔여 체력
												System.out.print("힘 : " + "[" + dto.getMonster1Str() + "]" + "\t");
												System.out.println("HP : " + "[" + b + "]");
												a--;
											} else {
												System.out.println("스킬 사용 잔여 횟수가 없습니다.");
												System.out.println("몬스터 턴으로 넘어갑니다.");
												// 다시 번호를 입력해주세요! -> 번호 입력으로 돌아가기
											}

										} else {
//	                           다시입력
										}
										/////////////////////// 몬스터 공격
										System.out.println("몬스터의 공격 !! 데미지 : " + dto.getMonster1Str() + "의 데미지 를 입었다");
										c -= dto.getMonster1Str();
										System.out.print("힘 : " + "[" + dto.getStr() + "]" + "\t");
										System.out.println("HP : " + "[" + c + "]");
										if (c <= 0) {
//	                           캐릭터 사망
											System.out.println("캐릭터가 사망했습니다ㅜㅜ");
											break;
										} else if (b <= 0) {
//	                           몬스터 사망
											System.out.println("Victory!!");
											break;
										}
									}
								} else if (select == 2) {
//	                     도망
									break;
								} else {
//	                     다시선택
									System.out.println("다시 선택해주세요");
								}
							}
						} else if (select == 2) {
//	               스테이지 2

						} else if (select == 3) {
//	               스테이지 3

						} else if (select == 4) {
//	               스테이지 4

						}
					} else if (select == 2) {
//	               상점선택
						System.out.println("상점에 오신걸 환영합니다 !");
						break;
					} else {
						System.out.println("다시 선택해 주세요");
					}
				}
			} else if (answer.equals("N") || answer.equals("n")) {
				System.out.println("게임 종료");
				break;
			} else {
				System.out.println("잘 못 입력 되었습니다. 다시선택해 주세요");
			}
		}
		sc.close();
	}

}
