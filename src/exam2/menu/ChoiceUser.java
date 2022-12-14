package exam2.menu;

import exam2.Game;

import java.util.Scanner;

public class ChoiceUser implements CommandI{
    MenuItem menuItem;
    public ChoiceUser(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пункт меню...");
        int userChoice = in.nextInt();
        if (userChoice == 1) {
            Game game = new Game();
            game.startGame();
        } else if (userChoice == 2) {
            System.out.println("Загрузка игры - до делать!");
        }
        else if (userChoice == 3) {
            System.out.println("До встречи!");
            System.exit(0);
        } else {
            System.out.println("Введите корректный пункт!");
        }
    }
}
