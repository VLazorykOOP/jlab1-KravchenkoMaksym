import java.util.Scanner;
import java.util.StringTokenizer;

public class FilterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        FilterWordsProcessor processor = new FilterWordsProcessor();
        String result = processor.filterWords(inputText);

        System.out.println("Результат:");
        System.out.println(result);
    }
}

class FilterWordsProcessor {
    public String filterWords(String inputText) {
        StringTokenizer tokenizer = new StringTokenizer(inputText, " ,.?!:;");

        StringBuilder resultBuilder = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (!startsWithVowel(word)) {
                resultBuilder.append(word).append(" ");
            }
        }

        return resultBuilder.toString().trim();
    }

    private boolean startsWithVowel(String word) {
        String firstLetter = word.substring(0, 1).toLowerCase();
        return "аеєиіїоуюя".contains(firstLetter);
    }
}
