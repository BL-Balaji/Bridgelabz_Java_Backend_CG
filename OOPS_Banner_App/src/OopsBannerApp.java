/**
 UC3: Refactor banner logic into reusable methods
**/

public class OopsBannerApp {
    public static String[] getOPattern()
    {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }
    public static String[] getPPattern()
    {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    public static String[] getSPattern()
    {
        return new String[]{
                " **** ",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " **** "
        };

    }
    public static void main(String[] args) {
        String[] getOPattern = getOPattern();
        String[] getPPattern = getPPattern();
        String[] getSPattern = getSPattern();

        for (int i = 0; i < getOPattern.length; i++) {
            System.out.println(
                    getOPattern[i] + " " + getOPattern[i] + " " + getPPattern[i] + " " + getSPattern[i]
            );
        }
    }
}