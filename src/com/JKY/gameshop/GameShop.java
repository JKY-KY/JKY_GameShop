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
				GameType.RPG.toString(),
				GameType.어드벤쳐.toString(),
                GameType.액션.toString(),
                GameType.FPS.toString(),
                GameType.레이싱.toString() );
		
		System.out.println(menu);
		int idx = LocalDate.now().getDayOfYear() % gameTypes.length;
//		gametype // 배열 학습 후 완성
		String weekDay = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("E") // E => Weekday
				.withLocale(Locale.KOREAN));
		System.out.println(weekDay + "요일의 추천장르는 " + gameTypes[idx] + "!!");
//      GameType.RPG.ordinal()
			
		System.out.println("원하시는 게임 장르를 입력해주세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		String 게임장르 = scanner.next();
		System.out.println("고객님은 " + 게임장르 + " 장르를 선택하셨습니다!");
		scanner.close();
		
		return;
	}
}