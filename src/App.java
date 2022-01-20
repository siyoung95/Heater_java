import java.util.Scanner;
import java.lang.Thread;

public class App {

	public static void main(String[] args) {
		Heater x = new Heater();
		

		////히터 강도를 설정한다
		//1.히터 강도 메뉴
		System.out.println("히터 강도를 선택하시오");
		System.out.println("1.히터 (약) 2.히터 (강) 3.히터+온풍 (약) 4.히터+온풍 (강)");
		//2.메뉴선택 (스캐너로 입력받음)
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		//3.각 메뉴에 맞게 작동 (if문 사용이유: 여러 선택지 중 한개를 선택하려고, while문 사용이유: 선택지 중 하나를 선택할 때까지 반복하려고)
		while(true) {
			if(input1 == 1) {
				x.weakHeat();
				x.Object();
				break;
			} else if (input1 == 2) {
				x.strongHeat();
				x.Object();
				break;
			} else if (input1 == 3) {
				x.weakHeat();
				x.weakWind();
				x.Object();
				break;
			} else if (input1 == 4) {
				x.strongHeat();
				x.strongWind();
				x.Object();
				break;
			} else {
				System.out.println("없는 메뉴입니다. 다시 선택해 주세요.");
			}
		}
		
		
		
		////히터 작동시간을 설정한다
		//1.히터 작동시간 메뉴
		System.out.println("히터 작동시간을 선택하시오");
		System.out.println("1.연속 2.30분 3.60분 4.90분 5.150분 6.180분");
		//2.메뉴선택 
		int input2 = scan.nextInt();
		//3.각 메뉴에 맞게 작동 
		while(true) {
			if(input2 == 1) {
				x.time = 0;
				x.Object();
				break;
			} else if(input2 == 2) {
				x.time = 30;
				for(int i=0; i<=30; i++) {
					try {
						x.movingWind();
						x.Object();
						x.timeDown();
						Thread.sleep(1000);						
					} catch(InterruptedException e) { }
				}
				break;
			} else if(input2 == 3) {
				x.time = 60;
				for(int i=0; i<=60; i++) {
					try {
						x.movingWind();
						x.Object();
						x.timeDown();
						Thread.sleep(1000);						
					} catch(InterruptedException e) { }
				}
				break;
			} else if(input2 == 4) {
				x.time = 90;
				for(int i=0; i<=90; i++) {
					try {
						x.movingWind();
						x.Object();
						x.timeDown();
						Thread.sleep(1000);						
					} catch(InterruptedException e) { }
				}
				break;
			} else if(input2 == 5) {
				x.time = 150;
				for(int i=0; i<=150; i++) {
					try {
						x.movingWind();
						x.Object();
						x.timeDown();
						Thread.sleep(1000);						
					} catch(InterruptedException e) { }
				}
				break;
			} else if(input2 == 6) {
				x.time = 180;
				for(int i=0; i<=180; i++) {
					try {
						x.movingWind();
						x.Object();
						x.timeDown();
						Thread.sleep(1000);						
					} catch(InterruptedException e) { }
				}
				break;
			} else {
				System.out.println("없는 메뉴입니다. 다시 선택해 주세요.");
			}
		}
		scan.close();
	}

}
