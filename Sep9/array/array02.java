package Sep9.array;

public class array02 {
    public static void main(String[] args) {
        int[] marks= new int[5];
        //integer default value is 0.
        marks[0]= 88;
        marks[1]= 90;
        marks[2]=95;
        marks[3]=65;
        marks[4]=80;
        String[] fruits=  new String[3];
        //string default value is null.
        fruits[0]="Orange";
        fruits[1]="Apple";
        fruits[2]="Grapes";
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //System.out.println(fruits[0]);
     //   System.out.println(fruits[1]);
      //  System.out.println(fruits[2]);
//other way of printing string
        System.out.println(fruits.length);
        for( int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
}
