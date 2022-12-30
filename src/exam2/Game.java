package exam2;

import exam2.menu.*;

import java.io.Serializable;


public class Game implements Serializable {

    public void showMenu() {
        MenuItem menuItem = new MenuItem();
        Menu menu = new Menu(new StartGame(menuItem),
                new SafeGame(menuItem),
                new ExitGame(menuItem),
                new ChoiceUser(menuItem),
                new LoadGame(menuItem),
                new ChooseUserInGame(menuItem));
        menu.startMenu();
    }

    public void startGame() {
        ParagraphList paragraphList = new ParagraphList();
        paragraphList.paragraphStart();
    }

    public void showMenuInGame() {
        MenuItem menuItem = new MenuItem();
        Menu menu = new Menu(new StartGame(menuItem),
                new SafeGame(menuItem),
                new ExitGame(menuItem),
                new ChoiceUser(menuItem),
                new LoadGame(menuItem),
                new ChooseUserInGame(menuItem));
        menu.startMenuAfterGame();
    }

    public void save(Paragraph paragraph){
        SafeLoad<Paragraph> paragraphSafe = new SafeLoad<>();
        paragraphSafe.saveGame(paragraph);
    }

}
