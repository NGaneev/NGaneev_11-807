import java.util.ArrayList;
import java.util.List;

public class CosAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> words = new ArrayList<>();
        List<String> AllWords = AllWords(te1.getText(), words);
        AllWords = AllWords(te2.getText(), AllWords);
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        List<Integer> vector1 = FindVector(AllWords, list1);
        List<Integer> vector2 = FindVector(AllWords, list2);
        return CosSimilarity(vector1, vector2);
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("?", "");
        text = text.replace("!", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private List<String> AllWords(String text, List<String> AllWords) {
        List<String> list = tokenize(text);
        for (String word : list) {
            if (!AllWords.contains(word)) {
                AllWords.add(word);
            }
        }
        return AllWords;
    }

    private List<Integer> FindVector(List<String> allWords, List<String> text) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for (String BossWord : allWords) {
            for (String word : text) {
                if (BossWord.equals(word)) {
                    counter++;
                }
            }
            list.add(counter);
            counter = 0;
        }
        return (list);
    }

    private double CosSimilarity(List<Integer> vector1, List<Integer> vector2) {
        double sumAB = 0;
        double sumA = 0;
        double sumB = 0;
        for (int i = 0; i < vector1.size(); i++) {
            sumAB += vector1.get(i) * vector2.get(i);
            sumA += vector1.get(i) * vector1.get(i);
            sumB += vector2.get(i) * vector2.get(i);
        }
        return (sumAB / (Math.sqrt(sumA) * Math.sqrt(sumB)));
    }
}
