package guru.springframework.service;

import java.util.*;
import java.util.stream.Collectors;

public class teste {

    public static void main(String[] args) {
//String text = "It is time to write good code";
        String text = "Its is2 timed tod write goodd codde";
        String[] words = text.split(" ");
        List<String> listWords = Arrays.asList(words);
        List<String> onlyEven = listWords.stream().filter(e -> (e.length() % 2 == 0)).collect(Collectors.toList());

        if(!onlyEven.isEmpty()) {
            Optional<String> largestWord  = onlyEven.stream().max(Comparator.comparingInt(String::length));
            onlyEven.remove(largestWord.get());
            System.out.println(getOtherLargest(onlyEven, largestWord.get()));
        } else {
            System.out.println("00");
        }
    }

    public static String getOtherLargest(List<String> onlyEven, String word) {
        if(onlyEven.isEmpty()) {
            return "";
        } else  {
            List<String> newOnlyEven = new ArrayList<String>(onlyEven);
            newOnlyEven.remove(word);
            Optional<String> newLargestWord = newOnlyEven.stream().max(Comparator.comparingInt(String::length));
            if(word.length() >= newLargestWord.get().length()) {
                return word;
            } else {
                return getOtherLargest(newOnlyEven, newLargestWord.get());
            }
        }
    }


}
