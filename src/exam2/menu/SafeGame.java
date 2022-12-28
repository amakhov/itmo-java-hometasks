package exam2.menu;

public class SafeGame implements CommandI{
    MenuItem menuItem;

    public SafeGame(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        menuItem.safeGame();
    }
}
