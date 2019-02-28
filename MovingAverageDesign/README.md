# Moving Average Calculator

A class design which calculates moving average of all real numbers in a stream of numbers.

## How to do it?

A listener which will keep reading inputs.

No need for storing all the numbers in the memory. 

## Formula

The formula used
```
Simple Average(n) = Sum (n) / n
Moving Average(n) = [SimpleAverage(n-1) * (n-1) + n] / n
```

Methods

 - void updateMovingAverage(double newNumber)
 - void streamInput()
 - double returnCurrentAverage()
 - Getter methods

