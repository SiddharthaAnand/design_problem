# LastNAverage Design

## Problem
You have to find the average of the last N numbers that are coming in a stream of numbers.

## Possible solution
Assuming that the value N is relatively smaller that can fit in the main-memory, I can 
store the last N numbers seen in an array. Once the array is full, then I can start 
replacing the values from the array in fcfs order.

There are 2 ways to find the average now:

- Calculate the average everytime of those N elements in the array. O(n)
- Keep a running average. O(1)

## Methods
- double getAverage()
- readInput()
- storeElement()