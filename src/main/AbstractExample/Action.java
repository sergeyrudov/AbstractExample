package AbstractExample;

public class Action {
    public static void main(String[] args) {
        // Create ios & android objects. Request is abstract class, and have 1 empty method
        // Classes iosGetPlatform & androidGetPlatform contains realized methods, and inherited from Request


        Request android = new androidGetPlatform();
        Request ios = new iosGetPlatform();

        // For android and ios objects, I've call method, and send platform from enum Platforms
        // if conditions correct, notice in console will be shown

        System.out.println(android.getInfo(Platforms.ANDROID));

        System.out.println(ios.getInfo(Platforms.IOS));

        System.out.println(android.getInfo(Platforms.BLACKBERRY_OS));
        System.out.println(ios.getInfo(Platforms.SYMBIAN));

    }
}

