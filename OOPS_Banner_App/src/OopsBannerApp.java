/**
 * OOPSBannerApp - UC4
 *
 * Displays the message "OOPS" as an ASCII banner using
 * an inner class to encapsulate character patterns.
 *
 * Concepts used:
 * - Inner Class
 * - Encapsulation
 * - Static Utility Methods
 * - StringBuilder
 * - Nested Loops
 */
public class OopsBannerApp {

    /**
     * Inner class to store a character and its ASCII pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes character pattern mappings
     *
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "**** ",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    ",
                        "*    ",
                        "*    "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ****",
                        "*    ",
                        " *** ",
                        "    *",
                        "    *",
                        "*   *",
                        " *** "
                }),

                // Space pattern (fallback)
                new CharacterPatternMap(' ', new String[]{
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                })
        };
    }

    /**
     * Returns the pattern for a given character
     *
     * @param ch       character to search
     * @param charMaps available character pattern maps
     * @return ASCII pattern for the character
     */
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // fallback to space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as an ASCII banner
     *
     * @param message  text to display
     * @param charMaps available character patterns
     */
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        // Each character pattern has 7 rows
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        // Step 1: Create character-pattern mappings
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Step 2: Message to display
        String message = "OOPS";

        // Step 3: Print banner
        printMessage(message, charMaps);
    }
}
