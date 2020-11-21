package AbstractExample;

public class androidGetPlatform extends Request {

    @Override
    public String getInfo(Platforms value) {
        if (value.equals(Platforms.ANDROID)) {
            return "yep, am ANDROID";
        }
        return "My OS is NOT: " + value ;
    }
}

