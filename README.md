# robo

__Approach:__
Robo uses a clean __linear algebra approach__ to express the robot’s state. Rather than expressing rotation with hard coded state machine, I introduce 2 vectors: direction, position;
Then, the operations of rotation and move can be described in terms of straightforward mathematical model of vector manipulation;

__Design:__
Storage:
In-built key-value storage is immutable and initiated in the static block first thing after the program launch;
It contains 3 structures:
It describes matrix;
As we know matrix we deal with a quadratic matrix, with the beginning in (0,0)
We can store only vector coordinates [0,5] which form this matrix.
Aliases for direction names and angles.
It’s important that design allows for easy a  change -  adding new angles and direction is very straight-forward;

Services:
Process service is the main state manipulator and business logic holder;
Move-, Place- and Rotate- Services were designed to incorporate single responsibility principle;
Validator - checks if the command to be performed is a legal one;