package AbstractExample;

public class Action {
    public static void main(String[] args) {
        // Created ios & android objects. RequestOSName is abstract class, and have 1 empty method
        // Classes iosGetOSName & androidGetOSName contains realized methods, and inherited from RequestOSName


        RequestOSName android = new androidGetOSName();
        RequestOSName ios = new iosGetOSName();

        // For android and ios objects, I've called method, and send OS from enum OSNameList, to getInfo() method
        // if conditions correct, notice in console will be shown

        System.out.println(android.getInfo(OSNameList.ANDROID));

        System.out.println(ios.getInfo(OSNameList.IOS));

        System.out.println(android.getInfo(OSNameList.BLACKBERRY_OS));
        System.out.println(ios.getInfo(OSNameList.SYMBIAN));

    }
}

