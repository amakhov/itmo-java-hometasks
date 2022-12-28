package exam2;

import java.util.Scanner;

public class ParagraphList {

    public void carryHoneyToBear(){
        Paragraph paragraph = new Paragraph("Скорее отнести мёд Медвежонку",
                "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, " +
                        "что Бельчонок никогда не пошёл бы в глубь леса. \n" +
                        "Он заверял Лисёнка, что Белки не попадают в неприятности, " +
                        "и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.");
        System.out.println(paragraph);
        System.out.println("1. Медвежонок ничего не знает, нужно продолжить поиски ");
        System.out.println("2. Может быть он прав и Лисёнок просто паникует");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                findAlone();
            } else if (item == 2) {
                backHome();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void eatAndRest(){
        Paragraph paragraph = new Paragraph("Поесть немного и передохнуть",
                "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски.");
        System.out.println(paragraph);
        System.out.println(paragraph);
        System.out.println("ВЫ ПРОИГРАЛИ");
        System.exit(0);
    }

    public void tryStealHoney(){
        Paragraph paragraph = new Paragraph("Нужно попытаться выкрасть мёд немедленно",
                "Это была не лучшая идея. \n" +
                        "Пчёлы покусали Лисёнка, теперь ему самому нужна помощь.");
        System.out.println(paragraph);
        System.out.println("ВЫ ПРОИГРАЛИ");
        System.exit(0);
    }

    public void waitFlyWasps(){
        Paragraph paragraph = new Paragraph("Подождать, вдруг пчёлы улетят",
                "Лисёнок подождал немного, и пчёлы разлетелись. \n" +
                        "Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. \n" +
                        "Что же делать?");
        System.out.println(paragraph);
        System.out.println("1. Поесть немного и передохнуть");
        System.out.println("2. Скорее отнести мёд Медвежонку");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                eatAndRest();
            } else if (item == 2) {
                carryHoneyToBear();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void tryTakeChance(){
        Paragraph paragraph = new Paragraph("Нужно воспользоваться шансом и раздобыть мёд",
                "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. \n" +
                        "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.");
        System.out.println(paragraph);
        System.out.println("1. Подождать, вдруг пчёлы улетят");
        System.out.println("2. Нужно попытаться выкрасть мёд немедленно");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                waitFlyWasps();
            } else if (item == 2) {
                tryStealHoney();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void believeOwl(){
        Paragraph paragraph = new Paragraph("Поверить Сове и отправиться вглубь леса",
                "В глубине леса Лисёнок встретил Медвежонка. \n" +
                        "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.");
        System.out.println(paragraph);
        System.out.println("1. Нет, потрачено слишком много времени, нужно идти дальше");
        System.out.println("2. Нужно воспользоваться шансом и раздобыть мёд");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                findAlone();
            } else if (item == 2) {
                tryTakeChance();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void askWolf(){
        Paragraph paragraph = new Paragraph("Расспросить Волка",
                "Волк оказался вполне дружелюбным, но помочь не смог.\n " +
                        "Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. \n" +
                        "И как теперь поступить?");
        System.out.println(paragraph);
        System.out.println("1. Волк прав");
        System.out.println("2. Волку не стоит верить");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                backHome();
            } else if (item == 2) {
                findAlone();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void findAlone(){
        Paragraph paragraph = new Paragraph("Искать Бельчонка в одиночку",
                "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать.");
        System.out.println(paragraph);
        System.out.println("ВЫ ПРОИГРАЛИ");
        System.exit(0);
    }

    public void askOwl(){
        Paragraph paragraph = new Paragraph("Расспросить Сову",
                "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, " +
                        "бежавшего вглубь леса.\n " +
                        "Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.");
        System.out.println(paragraph);
        System.out.println("1. Поверить Сове и отправиться вглубь леса");
        System.out.println("2. Сове не стоит верить");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                believeOwl();
            } else if (item == 2) {
                findAlone();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void tryRecognize(){
        Paragraph paragraph = new Paragraph("Попытаться разузнать о Бельчонке у лесных жителей",
                "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. \n" +
                        "Остались только Сова и Волк. " +
                        "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. \n" +
                        "Кого выбрать?");
        System.out.println(paragraph);
        System.out.println("1. Расспросить Сову");
        System.out.println("2. Расспросить Волка");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                askOwl();
            } else if (item == 2) {
                askWolf();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void goToFind(){
        Paragraph paragraph = new Paragraph("Отправиться на поиски",
                "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему.\n " +
                        "Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. \nПомогите ему.");
        System.out.println(paragraph);
        System.out.println("1. Попытаться разузнать о Бельчонке у лесных жителей");
        System.out.println("2. Искать Бельчонка в одиночку");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                tryRecognize();
            } else if (item == 2) {
                findAlone();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

    public void backHome(){
        Paragraph paragraph = new Paragraph("Вернуться домой",
                "Вернувшись домой, Лисёнок нашёл там Бельчонка. \n" +
                        "Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. \n" +
                        "Он поспешил предупредить об этом Лисёнка, но они разминулись. \n" +
                        "Наконец-то друзья нашли друг друга!");
        System.out.println(paragraph);
        System.out.println("ВЫ ВЫИГРАЛИ");
        System.exit(0);
    }
    public void paragraphStart(){
        Paragraph paragraph = new Paragraph("Лисенок", "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. \n" +
                "Это утро не было исключением. \n" +
                "Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. \n" +
                "Лисёнок ждал, ждал, но так и не смог дождаться своего друга.\n" +
                "Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду. - подумал Лисёнок. \n" +
                "Как поступить Лисенку?");
        System.out.println(paragraph);
        System.out.println("1. Вернуться домой");
        System.out.println("2. Отправиться на поиски");
        System.out.println("3. Показать меню");
        Scanner in = new Scanner(System.in);
        System.out.println("...Выберите пункт...");
        while (true) {
            int item = in.nextInt();
            if (item == 1) {
                backHome();
            } else if (item == 2) {
                goToFind();
            } else if (item == 3) {
                Game game = new Game(); // без создания объекта не работает
                game.showMenuInGame();
            } else {
                System.out.println("Некорректное значение. Введите занова!");
            }
        }
    }

}