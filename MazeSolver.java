/*
* MAZE SOLVER
* static solve method aims to provide an answer to the question: what is the Boolean value of the statement "it is possible to get from the starting position to treasure"
*/
public class MazeSolver {

  public static boolean solve( Maze maze) {
    // BASE CASE 
    // If e is on treasure
    if ( maze.explorerIsOnA() == Maze.TREASURE) {  
      //       Return true 
      System.out.println( "Explorer is on Treasure");
      return true;
    }
    // Else if e is on a wall
    else if ( maze.explorerIsOnA() == Maze.WALL) {
      return false;
    } 
    // bc we only tested base cases, we needed a default response without the recursive abstraction  
    else { 
    return false;
    }
  }
}

