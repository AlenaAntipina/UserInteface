package data;

public enum InternetPage {
    LOGIN;
    private static final String BASE_URL = "https://userinyerface.com/";

    InternetPage() {
    }

    public String getAddress() {
        return BASE_URL;
    }
}
