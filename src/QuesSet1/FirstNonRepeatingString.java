package QuesSet1;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingString {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = new String("java");
        boolean equals = (s1 == s2);
        System.out.println(equals);

        String sentence = "word1 word2   word3 word1 word4";

        int length = sentence.replaceAll("\\s","").length();

        System.out.println(length);

        String[] stringArray = sentence.split(" ");

        Optional<Map.Entry<String, Long>> entry = Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream()
                .filter(w -> w.getValue() == 1).findFirst();

        String result = entry.map(Map.Entry::getKey).orElse("No string found");

        System.out.println(result);

    }
}
