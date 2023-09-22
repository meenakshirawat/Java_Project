package Sep9.array;

import java.util.Scanner;

public class array04 {
    public static void main(String[] args) {
        //using scanner class fpr taking user input.
        //Find max number subject
        System.out.println("enter total Subjects");
        Scanner sc= new Scanner(System.in);
        int Total_subject= sc. nextInt();

        int []marks= new int [Total_subject];
        for (int i=0;i< marks.length;i++){
            System.out.println("Enter marks one by one");
            marks[i]= sc.nextInt();

        }
        //System.out.println("Here is your marks");
        for(int i=0;i<marks.length; i++)
        {
            System.out.println("Here is marks of subjects->"+marks[i]);
        }

        int max= marks[0];
        for(int i=0; i< marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("Max subject marks=>"+max);
    }

}
