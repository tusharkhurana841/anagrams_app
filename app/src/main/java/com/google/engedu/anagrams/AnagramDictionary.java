 package com.google.engedu.anagrams;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.HashSet;
        import java.util.Random;

public class AnagramDictionary {

    private static final int MIN_NUM_ANAGRAMS = 5;
    private static final int DEFAULT_WORD_LENGTH = 3;
    private static final int MAX_WORD_LENGTH = 7;
    private Random random = new Random();
    private HashSet<String> wordSet = new HashSet<String>();
    private ArrayList<String> wordList = new ArrayList<String>();
    private HashMap<String,ArrayList<String>> lettersToWord = new HashMap<String,ArrayList<String>>();

    public AnagramDictionary(InputStream wordListStream) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(wordListStream));
        String line;
        while((line = in.readLine()) != null) {
            String word = line.trim();
            wordSet.add(word);
            wordList.add(word);

            String key = alphaOrder(word);
            }
            if(lettersToWord.containsKey(key)){
                lettersToWord.get(key).add(word);
            }
            else{
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(word);
                lettersToWord.put(key,temp);
            }


        }
    }
    public String alphaOrder(String word)
    {
        char a[]=word.toCharArray();
        Arrays.sort(a);
        return  String.valueOf(a);
    }

    public boolean isGoodWord(String word, String base) {

        if(wordSet.contains(word) && !word.contains(base))
            return true;

        return false;
    }

    public ArrayList<String> getAnagramsWithOneMoreLetter(String word) {
        ArrayList<String> result = new ArrayList<String>();
        return result;
    }

    public String pickGoodStarterWord() {
        return "foo";
    }
}