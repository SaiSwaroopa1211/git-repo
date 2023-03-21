import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        int a=123, b=456;
        //int num;
        //Scanner num = new Scanner(System.in);
        System.out.println(a + b);
        int n=0,i;
        while(a > 0){
            i = a%10;
            n = n+i;
            a = a/10;
        }
        System.out.println(n);
    }
}
