package org.example.employee;

import java.util.Random;


//public enum Language {
//    ENGLISH, GERMAN, SPANISH, POLISH;
//
//    private static Random rand = new Random();
//
//    public static Language getRandomLang(){
//        Language[] all = Language.values();
//        return all[rand.nextInt(all.length)];
//    }
//}


public enum Languages {
    ENGLISH,
    GERMAN,
    SPANISH,
    POLISH;



        private static final Random RANDOM = new Random();

        public static int nextInt(int upper) {
            return RANDOM.nextInt(upper);
        }

        public Languages getRandom() {
            int languageIndex = nextInt(values().length);
            return values()[languageIndex];
        }

    }


