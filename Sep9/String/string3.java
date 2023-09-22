package Sep9.String;

public class string3 {
    public static void main(String[] args) {

        String n= "TTA";
        String n1="TTA";
        String n2="TTa";
        // using compareTo function , it will compare the string value in ASCII
        // format(UNICODE value) and provide the output in integer value.
        System.out.println(n.equals(n1));
        System.out.println(n.equals(n2));
        System.out.println(n.compareTo(n1));
        System.out.println(n.compareTo(n2));
        System.out.println(n2.compareTo(n));

    }
}
