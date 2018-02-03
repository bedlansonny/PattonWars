import java.util.*;
public class XMRoady{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        while(num-- > 0)
        {
            String artist = in.nextLine();
            String spaces = "                ";
            if(artist.length()<=16)
                artist = spaces.substring(0, 16-artist.length()) + artist;
            else
                artist = artist.substring(0,16);
            System.out.println(artist);
            
            String song = in.nextLine();
            
            if(song.length() <=16)
            {
                song = spaces.substring(0, 16-song.length()) + song;
                System.out.println(song);
            }
            else
            {
                int start = 0;
                int end = 16;
                do {
                    System.out.println(song.substring(start,end));
                    start++;
                    end++;
                } while (end<=song.length());
            }
            System.out.println();
            
            
        }
    }
}
    