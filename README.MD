Test Driven Development of Java GenericStack Class.

The test codes can be found at: Spring2019/CSE427/Assignment1/src/

List of all variables:

Objecx X
int top                 //State variable
ArrayList stackObjects     //State variable


       b)   Characteristics of Variables:
        
Objecx X can be null or any valid object.
int top can be 0 if stack is empty or 1+ if not.
ArrayList stackObjects can have 0 object, or null object or any number of valid objects.


c)   Characteristics of inputs:

    Characteristics of input Object X is whether it is null or not.
        True if null, i.e: X = null
        False if any other value, i.e: X = “String”, “0”, “abcd”




d)   Blocks of the characteristics after partitioning:
        
Partition
b1
b2

Q1: Whether Object X is null or not.
true
false

Partition
b1
b2

Q1: Whether stackObjects has null or not.
true
false

Partition
b1
b2
b3

Q1: Value of the int top.
0
1
2 or more


 
e)   Values of each block:
    
Parameter
b1
b2
X
null
“abcd”

Parameter
b1
b2
 stackObjects
(null, “abcd”)
(“abcd”, “edf”)

Parameter
b1
b2
b3
top
0
1
3

