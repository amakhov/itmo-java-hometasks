package exam2.menu;

public class LoadGame implements CommandI{
    MenuItem menuItem;

    public LoadGame(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void execute() {
        menuItem.loadGame();
    }
}
