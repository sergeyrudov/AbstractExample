package AbstractExample;

public enum Platforms {

    ANDROID ("android"),
    IOS ("ios"),
    BLACKBERRY_OS("blackberry"),
    SYMBIAN("symbian");


    private String displayName;

    Platforms(String displayName) {
        this.displayName = displayName;
    }
    public String toString() {
        return displayName;
    }
}