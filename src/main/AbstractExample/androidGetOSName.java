package AbstractExample;

public class androidGetOSName extends RequestOSName {

    @Override
    public String getInfo(Platforms value) {
        if (value.equals(Platforms.ANDROID)) {
            return "Yes, my platform is: "+ value.toString().toUpperCase();
        }
        return "My OS is NOT: " + value ;
    }
}

