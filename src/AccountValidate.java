import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidate {
    static boolean validateAccount(String string) {
        Pattern p = Pattern.compile("^[a-z0-9_]{6,}$");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static void main(String[] args) {
        String[] accounts = {"khoand", "KHoand","vip_pro"};
        for (String account : accounts) {
            System.out.println(account + ": " + validateAccount(account));
        }
    }
}