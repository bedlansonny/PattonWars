import java.util.*;
public class DistributiveLaw{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        System.out.printf("%d x (%d + %d) = %d x %d + %d x %d%n", a, b, c, a, b, a, c);
        System.out.printf("%d x %d = %d + %d%n", a, b+c, a*b, a*c);
        System.out.printf("%d = %d", a*(b+c), a*(b+c));
    }
}
    