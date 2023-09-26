import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.logging.Logger;

public class Base64Utils {
    private Base64Utils() throws IllegalAccessException {
        throw new IllegalAccessException("Utility class");
    }
    private static final Logger logger = Logger.getLogger(String.valueOf(Base64Utils.class));
    public static String ioToBase64(InputStream in) {
        String strBase64 = null;
        try {
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            strBase64 = new String(Base64.getEncoder().encode(bytes));
            in.close();
        }catch (IOException ioe) {

        }
        return strBase64;
    }
}
