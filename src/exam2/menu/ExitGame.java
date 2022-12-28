package exam2.menu;

public class ExitGame implements CommandI{
    MenuItem menuItem;

    public ExitGame(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        menuItem.exitGame();
    }
}
