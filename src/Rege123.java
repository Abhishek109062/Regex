public class Rege123 {
    public static void main(String[] args) {
        String str="abhi abhjkjki";
        String[] s1 ={"aaa","abcd","mamamma"};
        for(String i:s1)
        {
            if(i.matches("[a-z]{4}")==true)
                System.out.println(i);
        }
    }
}
