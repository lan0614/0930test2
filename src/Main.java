import java.util.* ;
public class Main {

    public static void main(String[] args) {
        //攝氏轉華氏
        Scanner in=new Scanner(System.in);
        int C;
        int F;
        C=in.nextInt();
        F=C*9/5+32;
        System.out.printf("%d\n",F);
    }
}