package Sep9.String;

public class string1 {
    public static void main(String[] args) {
        //== operator checks if two string references point to the same memory location.
        //equal method compares the actual content of the strings.
        //Checking if they contain the same sequence of characters.

        String s1= "Hello everyone";
        String s2= "Hello everyone";
        String s3= new String("Hello everyone");
        String s4= new String("hello everyone");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        /* In equalsIgnoreCase we just check the same sequence of characters.
        It ignores capital and small alphabets in string characters */
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
