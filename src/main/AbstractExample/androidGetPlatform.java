package AbstractExample;

public class androidGetPlatform extends Request {

    @Override
    public String getInfo(Platforms value) {
        if (value.equals(Platforms.ANDROID)) {
            return "Yes, my platform is: "+ value.toString().toUpperCase();
        }
        return "My OS is NOT: " + value ;
    }
}

