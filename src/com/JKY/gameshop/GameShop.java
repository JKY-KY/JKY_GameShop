package com.JKY.gameshop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class GameShop {
	
	public static void main(String[] args) {
		/**
		 * stringbuilder ==> stringbuffer로
		 */
		// CoffeeType 커피한잔 = CoffeeType.아메리카노;
		GameType game = GameType.RPG;
		System.out.println("JK 게임샵에 오신걸 환영합니다!");
		GameType gameTypes[] = GameType.values();
		
		/**
		 * 나중에 Enum to List 사용하여 깔끔하게 정리
		 */
		String menu = String.join("/",
				GameType.RPG.toString() + (GameType.RPG.ordinal() + 1),
				GameType.어드벤쳐.toString() + (GameType.어드벤쳐.ordinal() + 1),
                GameType.액션.toString() + (GameType.액션.ordinal() + 1),
                GameType.FPS.toString() + (GameType.FPS.ordinal() + 1),
                GameType.레이싱.toString() + (GameType.레이싱.ordinal() + 1));
		
		System.out.println(menu);
		int idx = LocalDate.now().getDayOfYear() % gameTypes.length;
//		gametype // 배열 학습 후 완성
		String weekDay = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("E") // E => Weekday
				.withLocale(Locale.KOREAN));
		System.out.println(weekDay + "요일의 추천장르는 " + gameTypes[idx] + "!!");

			
		System.out.println("원하시는 게임 장르의 번호를 입력해주세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int 장르번호 = scanner.nextInt();
		
		System.out.println("고객님은 " + 장르번호 + " 번을 선택하셨습니다!");
		
		GameType gameType = GameType.values()[장르번호 - 1];
		switch (gameType) {
		case RPG:
			System.out.println("RPG 장르를 선택하셨습니다!");
			break;
		case 어드벤쳐:
			System.out.println("어드벤쳐 장르를 선택하셨습니다!");
			break;
		case 액션:
			System.out.println("액션 장르를 선택하셨습니다!");
			break;
		case FPS:
			System.out.println("FPS 장르를 선택하셨습니다!");
			break;
		case 레이싱:
			System.out.println("레이싱 장르를 선택하셨습니다!");
			// break;
			default:
				break;		
		}
		
		scanner.close();
		return;
	}
}