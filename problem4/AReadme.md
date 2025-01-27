# Problem Statement 4
A sequence of positive integers is called "great" for a number X if we can divide it into pairs such that, for
each pair, multiplying the first number by X equals the second number. More formally, a sequence A of size
N is "great" for X if N is even and there exists a permutation P of size N such that for each i 
(1 <= i <= (N/2)),
we can rearrange it so that for every pair (Ai, Aj), we have ( Ai * x = Aj ).
Ram has a sequence A and a number X. Help Ram make the sequence "great" by determining the minimum
number of positive integers that should be added to the sequence A so that it becomes "great" for the
number X.
# Input Format
The first line of input contains two integers N, X representing the size of the sequence and the integer X
respectively.
The next line of input contains N space-seperated integers representing the elements of the
sequence A.
# Output Format
Print a single integer representing the minimum number of integers that need to be appended to the end of
list A in order to make it a great sequence for the number X.
