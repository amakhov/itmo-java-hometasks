package exam2;

public class Paragraph {
    public String name;
    public String text;

    public Paragraph(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return name + '\n' + text;
    }
}
