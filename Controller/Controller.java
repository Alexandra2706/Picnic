package Controller;

import Model.Words;
import Servise.ReadFromFile;
import View.View;

public class Controller {
    private String FILENAME = "input.txt";

    ReadFromFile rf;
    Words wordsArray = null;
    View<String> view;

    public Controller() {
        rf = new ReadFromFile();
        view = new View<String>();
    }

    public void run() {
        String words = rf.readFile(FILENAME);
        if (words.length() == 0) {
            System.out.println("Нет данных");
        } else {
            wordsArray = new Words(words);
            System.out.println(wordsArray.getWordsNumber());
            view.printList(wordsArray.getWordMaxLength(), "Самые длинные слова:");
            view.printMap(wordsArray.gerWordFrequency(), "Частота слов: ");
        }
    }
}
