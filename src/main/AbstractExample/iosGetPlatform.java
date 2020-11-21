package AbstractExample;

public class iosGetPlatform extends Request {

    @Override
    public String getInfo(Platforms value) {
        if (value.equals(Platforms.IOS)) {
            return "yep, am IOS";
        }
        return "My OS is NOT: " + value;
    }
}