package exam2.menu;

import exam2.Game;

public class StartGame implements CommandI{
    MenuItem menuItem;

    public StartGame(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        menuItem.startGame();
    }
}
