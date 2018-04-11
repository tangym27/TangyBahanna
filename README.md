# TangyBahanna

## personnel
Michelle Tang\
Hanna Yang

## statement of problem
what is the Boolean value of the statement “it is possible to get from the starting
position to treasure”

## recursive abstraction

When I am asked to\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;determine the Boolean value of the statement “it is possible to get from the starting position to treasure"\
The recursive abstraction can\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;determine the Boolean value of the statement “it is possible to get from a position next to the previous position to the starting positon to the treasure"
## base case
e is on the treasure -- true\
e is on a wall -- false
## English or pseudocode description of algorithm
If e is on treasure\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return true\
Else if e is on a wall\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return false \
Else \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Drop wall\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; For each possible direction\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Move e in the direction\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; invoke recursive abtraction
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; move e back (go back to snapshot)\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return false
## class(es), with fields and methods
## version n wishlist
- one possible way
- all possible ways
- shortest path 
- visualize the path  

