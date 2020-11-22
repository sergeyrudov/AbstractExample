package AbstractExample;

public class iosGetOSName extends RequestOSName {

    @Override
    public String getInfo(OSNameList value) {
        if (value.equals(OSNameList.IOS)) {
            return "Yes, my platform is: "+ value.toString().toUpperCase();
        }
        return "My OS is NOT: " + value;
    }
}