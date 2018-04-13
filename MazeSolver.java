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
			displayer= new Displayer (length);
    }
    
    public static boolean solve(Maze maze) {
      if ( maze.explorerIsOnA() == Maze.TREASURE) {  
        return true;
      }
      else if ( maze.explorerIsOnA() == Maze.WALL) {
        return false;
      } 
      else { 
        maze.dropA(Maze.WALL);
        Maze snapshot = new Maze( maze);
        for (int direction : directions) {
            maze.go(direction);
            displayerTest(maze);
            if (!solve(maze)){
              maze= new Maze(snapshot);
            }
            else return true;
        }
        return false;
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

