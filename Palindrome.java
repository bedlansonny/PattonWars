import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            boolean works = false;
            int start = in.nextInt();
            String result = "";
            for(int i = 0; i < 10; i++)
            {
                StringBuilder thing = new StringBuilder(Integer.toString(start));
                int rev = Integer.parseInt(thing.reverse().toString());
                start += rev;
                
                StringBuilder thingg = new StringBuilder(Integer.toString(start));
                if(Integer.toString(start).equals(thingg.reverse().toString()))
                {
                    works = true;
                    break;
                }
            }
            System.out.println(works ? start : "NONE, " + start);
        }
    }
}
    