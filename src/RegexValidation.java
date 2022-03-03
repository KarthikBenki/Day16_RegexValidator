import java.util.regex.Pattern;

public class RegexValidation {
    static public boolean isValid(String regex,String input) {
        Pattern pattern= Pattern.compile(regex);
        return pattern.matches(regex,input);

    }
    public static void main(String[] args) {
        boolean regexCheck = isValid("^[1-9]{1}[\\d]{2}[ ]?[\\d]{3}$","400 098");
        System.out.println(regexCheck);
    }
}
