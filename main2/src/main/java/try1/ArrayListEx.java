package try1;

import java.util.ArrayList;

public class ArrayListEx {

    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<>();
        for(String w : words) sentence.add(w);
        for(String w : more) sentence.add(w);
        return sentence;
    }

}
