import java.util.*;
public class NoDisassemble{
    static String[] num = {"one","two","three","four","five","six","seven","eight","nine","ten"};
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            System.out.printf("Number %s is alive!", num[in.nextInt()-1]);
        }
    }
}
    