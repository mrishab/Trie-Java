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

        // Adding all the words in the Trie
        for (String word : words)
            root.add(word);

        // Getting the words that match the given prefix (all of them, in this case)
        for (String prefix : prefixes) {
            System.out.print(prefix.toUpperCase() + ": ");
            List<String> wordList = root.getWords(prefix);
            for (String retrievedWord : wordList) {
                System.out.print(retrievedWord + ", ");
            }
            System.out.println();
        }
    }
    /***
     * Output:
     *
     * ANTI: antiaircraft, antiaircraftbody, antiaircraftbodyclimax, antiaircraftbodyclimaxseptic,
     * AUTO: autobiography, autobiographyfocus, autobiographyfocusmobile, autobiographyfocusmobilepilot,
     * CIRCUM: circumnavigate, circumnavigatescribe, circumnavigatescribevent,
     * MACRO: macrocosm, macrocosmeconomics, macrocosmeconomicsstructure,
     */
}
