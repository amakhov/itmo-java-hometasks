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
        }
        if (userChoice == 3) {
            System.out.println("До встречи!");
            System.exit(0);
        }
    }
}
