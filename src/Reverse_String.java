public class Reverse_String {
    public static void main(String[] args) {

        String s  = "Samiksha";
        String r = "";
        char ch ;

        for (int i = 0 ; i < s.length() ; i++)
        {
            ch = s.charAt(i);
            r = ch + r ;
        }
        System.out.println(r);

        StringBuffer s = "Samiksha";
        System.out.println(s.reverse());
    }
}
