package Sep2.Increment;

public class Practice4 {
    public static void main(String[] args) {
//Increment
        // Pre- and Post-Increment
        //++b=Pre
        //b++= Post
        //b=++b;// Please increment me before assign.
        //b=b++// Please assign me before increment.
        int a= 100;
        System.out.println(++a);

        int b= 20;
        System.out.println(++b + ++b);
        //++b -> exp=21, b= 21
        //+
        //++b ->b=22, exp=22
        System.out.println(b);

        int c= 2;

        System.out.println(c+ ++c + ++c + c);
        //c-> c=2, exp=2
        //+
        //++c-> exp=3, c=3
        //+
        //++c->exp=4, c=4
        //+
        //c->c=4

        int aa= 1;
        System.out.println(aa+ aa++ +aa++ + aa);
        //aa-> aa=1, exp=1
        //+
        //aa++ -> aa=1, exp=1 =>after aa=2
        //+
        //aa++ ->aa=2, exp= 2 =>after aa=3
        //+
        //aa -> aa=3, exp=3
    }
}
