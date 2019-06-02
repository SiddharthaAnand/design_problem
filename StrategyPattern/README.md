# Design Puzzle One (Strategy Pattern)
This is a solution to a specific kind of design problem
which has already been faced by many experienced 
developers. I will describe the problem in detail 
which has been referenced from this 
[awesome book](https://www.amazon.in/Head-First-Design-Patterns-Brain-Friendly/dp/9352132777/ref=sr_1_1?crid=22MI2AHKGFDP6&keywords=headfirst+design+pattern&qid=1559474078&s=gateway&sprefix=headfirst+design%2Caps%2C279&sr=8-1).

We will learn a set of design principles as we go over
different kinds of design patterns, which will be 
mentioned here in this README.

## Identifying the Problem
We are going to design an Action-Adventure Game. For
the sake of learning, we will keep our design limited
to a few classes. The technical problem statement is
as follows:
 - The game will have different *Characters*.
 - Every character will have different kinds 
 of *Weapons*.
 - The behavior of weapons can change.
 - Each character can use only one weapon at a time,
 but can change to any other weapon at any point 
 in time.

## Suggesting a Solution(s)
Though I'll try to explain in detail about the 
solution we reach at, for more understanding, you 
can go through the first chapter of the mentioned 
book, and go over the **Duck example**, which is the 
first example of this book.

 - Since there are going to be different characters
 having some attributes common and some unique. We
 can have a Character superclass which is inherited
 by all concrete character classes like King, Queen,
 Knight. 
 - Now, we can have a weapon attribute in this class.
 But, we need to ask ourselves a few questions.
 - Does the class have an attribute which can change
 in future and also is it having attributes that are
 going to remain constant in future?
 - If the attribute which can change in future is kept
 inside the Character class, then are we going to have
 trouble maintaining those attributes if new changes
 are needed to be implemented. For example, weapon 
 can have an extra capability of 100 HorsePower if 
 it is held by a Knight v/s if it is held by a Queen. 
 - Or, if we write a concrete implementation of a weapon
 in Character class then can we specifically change 
 the behavior of a single or a set of weapons easily?
 
Now, we decide on a set of solutions based on the questions
that cropped into our minds above!

 - We will have a Character class which is abstract.
 The implementations is left to the user.
 
### Design Principle
 - We are separating out weapon as a separate interface.
 Since, in future this attribute can change and 
 keeping out the attributes that change from the attributes
 that remain constant is a design lesson! It will help
 you in not messing with the code that remains constant.
 
 - Design for an interface, not an implementation.
 - Favor composition over inheritance. 
 
 
## Implementing it!
This directory consists of files which has been taken
as an example above and implemented the solution
using Strategy Pattern based on above suggested answer.

