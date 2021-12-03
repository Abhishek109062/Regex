import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rege24 {
    public static void main(String[] args) {
        String target="277fsxjsd% sdkjs 349878vhrw912 ks ";
        Pattern p= Pattern.compile("\\d\\d\\d");
        Matcher m=p.matcher(target);
        int count=0;
        while(m.find())
        {
            count++;
            System.out.println(m.start()+"--"+ m.end()+"--"+m.group());

        }
        System.out.println(count);
    }
}
