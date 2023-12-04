import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of words: ");
        int count = scanner.nextInt();
        for(int i = 0; i < count ; i++){
            System.out.println("Enter Word: ");
            String word = scanner.next();
            words.addWord(word);
        }
        System.out.println("Enter Word to Search: ");
        String wordToSearch = scanner.next();
        int position = words.biarySearch(wordToSearch);
        if(position == -1){
            System.out.println("Word Not Found");
        }
        else{
            System.out.println("Word Found at Position " + position);
        }
    }
}
