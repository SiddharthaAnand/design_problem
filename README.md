# Design Problems

This directory stores different kinds of design problems and their implementations.
This will also contain the design patterns used in Software Engineering to solve
common problems.

## Last N Average Problem

Design a system which stores the average of last n values seen in a stream of 
integers.

## Moving Average Problem

Design a system which stores or returns the average of all numbers in a stream
of integers.

## Strategy Pattern

This is a design which is used or implemented when we have a class which has 
a set of behaviors which can change over time and is most expected to change.
You can follow the Headfirst Design Patterns for a better understanding of the
logic behind having this pattern. The Design Puzzle in the chapter of Strategy
Pattern has been solved here.

## Least Recently Used Cache (LRU Design)

Designing of a cache is tricky. We need to go back to the basics of how a 
cache works. Whenever there is an access requirement coming from a program
running in memory, the processor first checks if the accesed block address
is present in cache or not. This accessing needs to be very fast. If the 
block address is not present in memory (RAM) then it needs to be fetched 
from secondary memory. How can we design such a system where the check 
that a block is present in RAM could be as fast? Also, the RAM size is 
fixed at a constant value since it is smaller than main memory.

A data structure coming to mind is a dictionary or a HashMap whose average 
access time is O(1). For storing of block addresses, we can define a structure
which holds the data to be accessed. The eviction policy and addition of a 
new block should also occur in O(1) time. Can we use a linked list for that?
But, a singly linked list would still not help. us in adding a new node at
the correct position, or updating the position of the node without traversing 
the whole list from head. How can we overcome this? Can we use a structure
which points to the previous node as well? That will help us in pointing to the
previou and the next node in O(1) time.
