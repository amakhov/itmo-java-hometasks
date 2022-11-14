package ru.amakhov.hw14.message;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        // MessagePriority - enum
        int [] counts = new int[MessagePriority.values().length];
        for (Message message: messageList) {
            counts[message.getPriority().ordinal()] += 1;
        }
        for (MessagePriority priority : MessagePriority.values()) {
            System.out.println(priority + ": " + counts[priority.ordinal()]);
        }


    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int[] counts = new int[10];
        for (Message message: messageList) {
            counts[message.getCode()] += 1;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Код " + i + ", встречается = " + counts[i]);
        }
     }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        // переопределить hashcode equals
        System.out.println("Количество уникальных сообщений: " + new HashSet<>(messageList.size()));
    }

    // List -> ArrayList
    // Set -> HashSet
    // Map -> HashMap
    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return new ArrayList<>(new LinkedHashSet<>(messageList));
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println(messages);
        countEachPriority(messages);
        countEachCode(messages);
    }
}
