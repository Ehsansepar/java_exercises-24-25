package beginner_exercises;


public class exe02 {
    public static void main(String[] args) {
        int i = 0;

        String myStr = "Hello %o! One kilobyte is %,d bytes.";
        String result = String.format(myStr, 5, 1024);
        System.out.println(result);


        while(i <= 10) {
            String table = "%s X %s = ";
            // System.out.println(String.format(, args));
            i++;
        }
    }
}
