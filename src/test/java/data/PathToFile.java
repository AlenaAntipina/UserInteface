package data;

public enum PathToFile {
    PATH;

    private static final String PATH_TO_IMAGE = "src/test/resources/avatar.JPG";

    PathToFile() {
    }

    public String getPathToImage() {
        return PATH_TO_IMAGE;
    }
}
