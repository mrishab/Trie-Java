import java.util.List;

public class Test {

    public static void main(String[] args) {

        String[] prefixes = {"anti", "auto", "circum", "macro"};
        String[] words = {
                "anticlimax", "antiaircraft", "antiseptic", "antibody",
                "autopilot", "autobiography", "automobile", "autofocus",
                "circumvent", "circumnavigate", "circumscribe",
                "macroeconomics", "macrostructure", "macrocosm"
        };

        TrieNode root = new TrieNode();

        for (String word : words)
            root.add(word);

        for (String prefix : prefixes) {
            System.out.print(prefix.toUpperCase() + ": ");
            List<String> wordList = root.getWords(prefix);
            for (String retrievedWord : wordList) {
                System.out.print(retrievedWord + ", ");
            }
            System.out.println();
        }


    }
}
