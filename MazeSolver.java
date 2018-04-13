/*
* MAZE SOLVER
* static solve method aims to provide an answer to the question: 
* what is the Boolean value of the statement "it is possible to get from the starting position to treasure"
*/
public class MazeSolver {

    private static Displayer displayer;
    private static int step = 0;
    private static int[] directions = new int[]{Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};

    public static void display(int length){
			displayer = new Displayer (length);
    }
    
    public static boolean solve(Maze maze) {
      displayerTest(maze);
      if ( maze.explorerIsOnA() == Maze.TREASURE) {  		//If e is on treasure
        return true;																		//   Return true
      }
      else if ( maze.explorerIsOnA() == Maze.WALL) {		//Else if e is on a wall
        return false;																		//      Return false 
      } 	
      else { 																						//Else
        maze.dropA(Maze.WALL);													//       Drop wall
        Maze snapshot = new Maze( maze);								//       take a snapshot
        for (int direction : directions) {							//       For each possible direction
            maze.go(direction);													//          Move e in the direction
            //displayerTest(maze);
            if (!solve(maze)){													//          if the maze cannot be solved 
              																					// (via an invocation of the recursive abtraction)
              maze= new Maze(snapshot);
              displayerTest(maze);											//            move e back (go back to snapshot)
            }
            else return true;														//          (if the maze can be solved)           
          																							//					return true :)
        }
        return false;																		//      	return false
    	}
  	}
        /**
      Display changes to a maze.
      Run by using the height of your shell window as a final argument, like...
          java UserOfMaze mazes/4cell_treasureWest.txt 0 3 25
     */
    public static void displayerTest( Maze m ) {
        displayer.atTopOfWindow( m + "step " + step++);
        }
    }

