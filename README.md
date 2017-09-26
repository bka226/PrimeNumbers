# PrimeNumbers

(Sieve of Eratosthenes)  A prime number is any integer greater than one that is evenly divisible only 
be itself and 1.  The Sieve of Eratosthenes is a method of finding prime numbers.  It operates as follows:
a.Create a primitive type booleanarray with all elements initialized to true.  Array elements with prime indices will remain true.  All other array elements will eventually be set to false.
b.Starting with array index 2, determine whether a given element is true.  If so, look through the 
remainder of the array and set to falseevery element whose index is a multiple of the index for the element
with value true.Then continue the process with the next element with value true.  For array index 2, all 
elements beyond element 2 in the array that have indices which are multiples of2 (4, 6, 8, 10, etc.) will 
be set to false;  for array index 3, all elements beyond element 3 in the array that have indices which are multiples of 3 (indices 6, 9, 12, 15, etc.) will be set to false;  and so on.


Execution:
Please enter a number :
20
************************************
Printing prime numbers as requested:
************************************
2
3
5
7
11
13
17
19
********************************