package com.example.wordgame;

import java.util.Random;

public class Anagram {

    public static final Random RANDOM = new Random();
    public static final String[] WORDS = {"ΜΕΓΑΛΟΣ", "ΜΙΚΡΟΣ",
            "ΑΣΠΡΟ", "ΜΑΥΡΟ", "ΖΩΟ", "ΑΝΘΡΩΠΟΣ", "ΠΑΡΑΛΙΑ", "ΗΛΙΟΣ", "ΤΡΕΝΟ", "ΠΟΔΗΛΑΤΟ",
            "ΚΑΚΟΚΑΙΡΙΑ", "ΚΥΒΕΡΝΗΣΗ", "ΓΥΜΝΑΣΤΙΡΙΟ ", "ΓΥΑΛΙΑ", "ΝΟΣΟΚΟΜΕΙΟ", "ΠΛΗΡΩΜΗ", "ΘΕΑΤΡΟ",
            "ΖΑΚΕΤΑ", "ΥΠΟΛΟΓΙΣΤΗΣ", "ΒΙΒΛΙΟ"};

    public static String randomWord() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public static String shuffleWord(String word) {
        if (word != null  &&  !"".equals(word)) {
            char a[] = word.toCharArray();

            for (int i = 0; i < a.length; i++) {
                int j = RANDOM.nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            return new String(a);
        }

        return word;
    }
}

