package exam2.menu;


import exam2.Game;

public class Menu extends Game {
    CommandI start;
    CommandI safe;
    CommandI exit;
    CommandI choice;
    CommandI load;
    CommandI choiceGame;

    public Menu(CommandI start, CommandI safe, CommandI exit, CommandI choice, CommandI load, CommandI choiceGame) {
        this.start = start;
        this.safe = safe;
        this.exit = exit;
        this.choice = choice;
        this.load = load;
        this.choiceGame = choiceGame;
    }

    public void startMenu() {
        start.execute();
        load.execute();
        exit.execute();
        choice.execute();
    }

    public void startMenuAfterGame() {
        start.execute();
        safe.execute();
        exit.execute();
        choiceGame.execute();
    }
}
