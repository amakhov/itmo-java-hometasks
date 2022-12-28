package exam2;

import exam2.menu.*;

import java.io.Serializable;
import java.util.Scanner;


public class Game implements Serializable {

    transient private BinHandler<Game> gameHandler;

    public Game() {
        this.gameHandler = new BinHandler<>();
    }

    public void showMenu() {
        MenuItem menuItem = new MenuItem();
        Menu menu = new Menu(new StartGame(menuItem), new SafeGame(menuItem), new ExitGame(menuItem), new ChoiceUser(menuItem), new LoadGame(menuItem));
        menu.startMenu();
    }

    public void startGame() {
        ParagraphList paragraphList = new ParagraphList();
        paragraphList.paragraphStart();
    }

    public void showMenuInGame() {
        MenuItem menuItem = new MenuItem();
        Menu menu = new Menu(new StartGame(menuItem), new SafeGame(menuItem), new ExitGame(menuItem), new ChoiceUser(menuItem), new LoadGame(menuItem));
        menu.startMenuAfterGame();
    }

    public void save(){
        gameHandler.writeToFile(this);
    }

}
