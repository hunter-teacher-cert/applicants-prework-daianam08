There should be at least three static methods in addition to main. One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive. There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.

The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

A round is played as follows:

The shooter shoots (rolls) the dice.

* If he rolls a 2,3, or 12,that’s Craps and he loses.
* If he rolls a 7 or 11, that’s a Natural and he wins.

Otherwise:

* the value he rolled is now called the Point
* the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.

The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.