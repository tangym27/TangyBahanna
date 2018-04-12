/*
* MAZE SOLVER
* static solve method aims to provide an answer to the question: what is the Boolean value of the statement âit is possible to get from the starting position to treasureâ
*/
public class MazeSolver {
  

  public static boolean solve( Maze maze) {
    // BASE CASE 
    // If e is on treasure
    if ( maze.explorerIsOnA() == Maze.TREASURE) {  
      //       Return true 
      return true;
    }
    // Else if e is on a wall
    else if ( maze.explorerIsOnA() == Maze.WALL) {
      return false;
    } 
    
    else { 
    // Else 
    	explorer.drop
    //        Drop wall
    //        For each possible direction
    //          Move e in the direction
    //          invoke recursive abtraction
    //          move e back (go back to snapshot)
    //       return false
      
    }
  }
    //       Return false
    
    
    
}

/* FIELDS:
    public final static int TREASURE = 0;
    public final static int WALL = 1;
    public final static int STEPPING_STONE = 2;
    // directions that can be searched
    public final static int EAST =  1;
    public final static int NORTH = 2;
    public final static int WEST =  4;
    public final static int SOUTH = 8;
    private int[][] maze;
    private final static int MAX_RANKS = 64;
    private int rankCount;  // number of ranks in a constructed Maze
    
    private Vector explorerPosition;  // see Vector inner class, below
*/
/* METHODS:
 * go (int direction)
 * dropA( int mazeelement)
* explorerIsOnA()   [wall, treasure, etc.]
*/
