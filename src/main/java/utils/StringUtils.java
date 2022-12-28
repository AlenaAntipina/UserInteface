package utils;

public class StringUtils {

    private StringUtils(){}

    public static int getNumberOfCard(String text){
        return Integer.parseInt(String.valueOf(text.charAt(0)));
    }
}
