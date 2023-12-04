import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Words {
    ArrayList<String> words;
    Words(){
        words = new ArrayList<>();
    }
    public void addWord(String word){
        this.words.add(word);
        System.out.println("Word " + word + " added");
    }
    public void sort(){
        Comparator<String> comp = new Comparator<>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(this.words);
    }

    int biarySearch(String search){
        this.sort();
        int first = 0;
        int last = this.words.size();
        while(first <= last){
            int mid = (first + last) / 2;
            int compare = this.words.get(mid).compareTo(search);
            if(compare == 0){
                return mid;
            }
            else if(compare > 0){
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }
        return -1;
    }

}
