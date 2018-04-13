# TangyBahanna

## personnel
Michelle Tang\
Hanna Yang

## statement of problem
what is the Boolean value of the statement “it is possible to get from the starting
position to treasure?”

## recursive abstraction

>When I am asked to\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;determine the Boolean value of the statement “it is possible to get from the starting position to treasure"\
>The recursive abstraction can\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;determine the Boolean value of the statement “it is possible to get from a position next to the explorer's current position to the treasure."
## base case
e is on the treasure -- true\
e is on a wall -- false
## English or pseudocode description of algorithm
> If e is on treasure\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return true\
> Else if e is on a wall\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return false \
> Else \
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Drop wall\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; take a snapshot\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; For each possible direction\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Move e in the direction\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; if the maze cannot be solved ( via an invocation of the recursive abtraction)\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; move e back (go back to snapshot)\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; if the maze can be solved\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; return true :)\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return false
## class(es), with fields and methods
To aid with clarity, each name is accompanied with  
* its access (i.e. public/private/protected)
* whether it is static or non-static 
### Displayer
##### Fields
> windowHeight (private & non-static)\
> console (private & non-static)
##### Methods
> atTopOfWindow (public & non-static)\
> lineSeparatorsIn (private & static)
### Maze
##### Fields
> TREASURE (public & static)\
> WALL (public & static)\
> STEPPING_STONE  (public & static)\
> EAST (public & static)\
> NORTH (public & static)\
> WEST (public & static)\
> SOUTH (public & static)\
> maze (private & non-static)\
> MAX_RANKS (private & static)\
> explorerPosition (private & non-static)
##### Methods
> toString (public & non-static)\
> go (public & non-static)\
> dropA (public & non-static)\
> explorerIsOnA (public & non-static)
### Vector (Private Class Within Maze)
##### Fields
> rank (private & non-static)\
> file (private & non-static)
##### Methods
> add (private & non-static)\
> equals (private & non-static)
### UserOfMaze
##### Fields
> displayer (private & static)
##### Methods
> main (public & static)\
> moveTest (private & static)\
> dropTest (private & static)\
> copyConstructTest (private & static)\
> displayerTest (private & static)\
> snapshotDemo (private & static)
### MazeSolver
##### Fields
> displayer (private & static)\
> step (private & static)\
> directions (private & static)
##### Methods
> solve (public & static)\
> displayerTest(private & static)\
### UserOfMazeSolver
##### Fields
null
##### Methods
> main (public & static)\
> baseTest (private & static)

## known bugs
### Displayer
If the person gives drops the explorer in a place that is not in the puzzle, then there is no display. It will just return false. In addition, the explorer disappears when it is on a boundary. When backtracking, after the first step, the displayer shows the stepping stone as a wall.
## version n wishlist
- one possible way
- all possible ways
- shortest path 
- visualize the path  

