package AbstractExample;

public class iosGetOSName extends RequestOSName {

    @Override
    public String getInfo(Platforms value) {
        if (value.equals(Platforms.IOS)) {
            return "Yes, my platform is: "+ value.toString().toUpperCase();
        }
        return "My OS is NOT: " + value;
    }
}