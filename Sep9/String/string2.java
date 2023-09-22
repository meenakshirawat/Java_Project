package Sep9.String;

public class string2 {
    public static void main(String[] args) {
        // using contact operation a separate string is generated.
        // And output for equals operator is always false.
        //Strings are immutable in nature.
        String name="Hello";
        String name1="Java";
        String name2="everyone like java";
        String name3= name.concat(name1);
        String name4="Hello Java";
        System.out.println(name3==name4);


    }

}
