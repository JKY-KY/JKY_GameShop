package com.JKY.gameshop;

public class GameShop {
	
	public static void main(String[] args) {
		/**
		 * stringbuilder ==> stringbuffer로
		 */
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
		String[] menus = menu.split("/");
		return;
	}
}