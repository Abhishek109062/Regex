import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rege89 {
    public static void main(String[] args) {
        String target="jdbc regular expression jdbc is important";
        Pattern p= Pattern.compile("jdbc",Pattern.CASE_INSENSITIVE);
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
