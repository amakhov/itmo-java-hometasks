package exam2.menu;

import exam2.Game;
import exam2.Paragraph;

import java.util.Scanner;

public class MenuItem{
    public void startGame(){
        System.out.println("1. Начать игру");
    }

    public void safeGame() {
        System.out.println("2. Сохранить игру");
    }

    public void loadGame() {
        System.out.println("2. Загрузить игру");
    }

    public void exitGame() {
        System.out.println("3. Выйти");
    }


}
