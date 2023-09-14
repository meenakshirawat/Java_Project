package Sep3;

public class loop1 {
    public static void main(String[] args) {
     int r, c, n=5;
//r for rows and c for columns and n for total no of rows we want to print
        for(r=0;r<n; r++){
            //loop for rows
            for(c=0;c<=r;c++) {
                //loop for columns
                System.out.print("*");//print"*"
            }
            System.out.println();//print "*" in next line
        }

    }
}
