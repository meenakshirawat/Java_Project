package Sep9;

public class do004 {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("Execute me multiple times "+ i);
            if(i>5){
                break;
            }
          i++;

        }while(i<10);
    }
}
