import java.util.*;
public class Minelayer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        char[][] grid = new char[15][];
        for (int i = 0; i < grid.length; i++)
            grid[i] = scan.nextLine().toCharArray();
            
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '*')
                    continue;
                int numMines = 0;
                numMines += checkForMine(r-1,c-1,grid);
                numMines += checkForMine(r-1,c,grid);
                numMines += checkForMine(r-1,c+1,grid);
                numMines += checkForMine(r,c-1,grid);
                numMines += checkForMine(r,c+1,grid);
                numMines += checkForMine(r+1,c-1,grid);
                numMines += checkForMine(r+1,c,grid);
                numMines += checkForMine(r+1,c+1,grid);
                if (numMines > 0) grid[r][c] = (char)(numMines + 48);
            }
        }
        
        for (int j = 0; j < grid.length; j++) {
            System.out.print(grid[j]);
            System.out.println();
        }
    }
    
    public static int checkForMine(int r, int c, char[][] grid) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length)
            return 0;
        return grid[r][c] == '*' ? 1 : 0;
    }
}
    