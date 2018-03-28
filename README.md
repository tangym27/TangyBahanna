# TangyBahanna

## personnel
Michelle Tang\
Hanna Yang

## statement of problem
what is the Boolean value of the statement “it is possible to get from the starting
position to treasure”

## recursive abstraction

When I am asked to\
	determine the Boolean value of the statement “it is possible to get from the starting position to treasure"\
The recursive abstraction can\
	determine the Boolean value of the statement “it is possible to get from a position with one less choice than the starting positon to the treasure"
## base case
e is "right before" 0 OR there are no choices
## English or pseudocode description of algorithm
If e is "right before" 0\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return true\
Else if numbers of choices for the "forwards direction" is 0\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return false\
Else \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;For each possible "forwards direction"\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Move e in the "forwards direction"\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Invoke recursive abstraction\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Move e back
## class(es), with fields and methods
## version n wishlist
- one possible way
- all possible ways
- shortest path 
- visualize the path  
