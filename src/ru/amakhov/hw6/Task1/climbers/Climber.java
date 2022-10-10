package ru.amakhov.hw6.Task1.climbers;

public class Climber {
    private String name;
    private String address;


    public Climber (String name, String address) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("имя должно быть больше 3-х символов");
        }
        this.name = name;
        if (address.length() < 5) {
            throw new IllegalArgumentException("адрес должен быть больше 5 символов");
        }
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
