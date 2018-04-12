/*
* USER OF MAZE SOLVER
* here we will be testing to make sure that the maze solver works for the 
* 0. base case
* 1. small recursive case
* 2. big recursive case 
*/ 
public class UserOfMazeSolver { 

    public static void main( String[] commandLine) 
	 throws java.io.FileNotFoundException {
        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1]) // explorer positions
                            , Integer.parseInt( commandLine[2]) // explorer positions
                            );
      	baseTest(maze);
    }
    
    /**
      run one test
      base case for treasure: 
      java UserOfMazeSolver mazes/justTreasure.txt 0 0
      base case for wall:
      java UserOfMazeSolver mazes/justWall.txt 0 0
     */
    private static void baseTest (Maze maze){
      System.out.println(MazeSolver.solve(maze));
    }
}
