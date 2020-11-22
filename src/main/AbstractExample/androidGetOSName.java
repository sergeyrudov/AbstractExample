package AbstractExample;

public class androidGetOSName extends RequestOSName {

    @Override
    public String getInfo(OSNameList value) {
        if (value.equals(OSNameList.ANDROID)) {
            return "Yes, my platform is: "+ value.toString().toUpperCase();
        }
        return "My OS is NOT: " + value ;
    }
}

