package ru.amakhov.hw6.Task1.climbers;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain (String name, String country, int height){
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("имя должно быть больше 4-х символов");
        } else if (country.length() < 4){
            throw new IllegalArgumentException("имя должно быть больше 4-х символов");
        } else if (height < 100) {
            throw new IllegalArgumentException("высота должна быть 100 метров");
        }
        this.name = name;
        this.country = country;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
