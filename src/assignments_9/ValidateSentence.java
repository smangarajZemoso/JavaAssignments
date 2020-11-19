package assignments_9;

import java.util.regex.Pattern;

public class ValidateSentence {

    public static boolean validateSentence(String sentence, String regex) {
        return Pattern.compile(regex).matcher(sentence).matches();
    }

    public static void main(String[] args) {
        String sentence = "Edasd dasdsa dsad.";
        String regex = "^[A-Z].*[.]$";
        System.out.println(validateSentence(sentence, regex));
    }
}
