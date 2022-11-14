package ru.amakhov.hw6.Task1.climbers;

public class Climber {
    private String name;
    private String address;




    public Climber (String name, String address) {
        if (name == null || name.length() < 3) {    //  добавить
            throw new IllegalArgumentException("имя должно быть больше 3-х символов");
        }
        if (address == null || address.length() < 5) {
            throw new IllegalArgumentException("адрес должен быть больше 5 символов");
        }
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
