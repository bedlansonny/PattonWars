import java.util.*;
public class Octagonally{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            String[] lines = new String[n];
            lines[0] = spaces(n-1) + stars(n);
            
            for(int i = 1; i < n; i++)
            {
                lines[i] = spaces(n-1-i) + "x" + spaces(n+2*(i-1)) + "x";
            }
            
            for(int i = 0; i < n-1; i++)
                System.out.println(lines[i]);
                
            for(int i = 0; i < n; i++)
            {
                System.out.println(lines[n-1]);
            }
            
            for(int i = n-2; i >=0; i--)
            {
                System.out.println(lines[i]);
            }
            
            System.out.println();
            
            
        }
    }
    
    static String spaces(int amt)
    {
        String output = "";
        for(int i = 0; i < amt; i++)
            output += " ";
        return output;
    }
    
    static String stars(int amt)
    {
        String output = "";
        for(int i = 0; i < amt; i++)
            output += "x";
        return output;
    }
}
    