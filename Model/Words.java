package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {
    private String[] wordsArray;

    public Words(String words) {
        wordsArray = words.split(" ");
    }

    public String[] getWordsArray() {
        return wordsArray;
    }

    public int getWordsNumber() {
        String[] wordsArray = getWordsArray();
        return wordsArray.length;
    }

    public List<String> getWordMaxLength() {
        String[] wordsArray = getWordsArray();
        int maxSize = 0;
        List<String> wordMax = new ArrayList<>();
        for (String word : wordsArray) {
            if (word.length() > maxSize) {
                maxSize = word.length();
                wordMax.clear();
                wordMax.add(word);
            } else if (word.length() == maxSize && !wordMax.contains(word)) {
                wordMax.add(word);
            }
        }
        return wordMax;
    }

    public Map<String, Integer> gerWordFrequency() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : wordsArray) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        return frequencyMap;
    }

}
