package exam2.menu;

import exam2.Paragraph;

import java.io.*;

public class SafeLoad<T> {
    private File file;
    public SafeLoad() {
        file = new File("sava_game.bin");
    }

    public void saveGame (Paragraph paragraph){
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)
        )
        {
            objectOutput.writeObject(paragraph);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Paragraph loadGame() {
        Object result = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            result = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return (Paragraph) result;
    }
}
