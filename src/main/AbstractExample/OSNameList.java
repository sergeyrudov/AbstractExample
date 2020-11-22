package AbstractExample;

public enum OSNameList {

    ANDROID ("android"),
    IOS ("ios"),
    BLACKBERRY_OS("blackberry"),
    SYMBIAN("symbian");


    private String displayName;

    OSNameList(String displayName) {
        this.displayName = displayName;
    }
    public String toString() {
        return displayName;
    }
}