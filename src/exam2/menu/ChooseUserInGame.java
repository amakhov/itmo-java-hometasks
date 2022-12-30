package exam2.menu;

import exam2.Game;
import exam2.Paragraph;

import java.util.Scanner;

public class ChooseUserInGame implements CommandI{

    MenuItem menuItem;

    public ChooseUserInGame(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        Game game = new Game();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пункт меню...");
        int userChoice = in.nextInt();
        if (userChoice == 1) {
            game.startGame();
        } else if (userChoice == 2) {
            System.out.println("Сохранение игры - До делать!");
           // game.save();
        } else if (userChoice == 3) {
            System.out.println("До встречи!");
            System.exit(0);
        }
    }
}
