# Relationship_Test
Project for CS233 Foundations of Computation class


This is a Java program that can read in the set of pairs defining a binary relation over some set of strings and determine some properties of that relation.

The input is:

a non-negative integer (n) giving the number of strings in the set
a sequence of n words (made up of letters, digits, or other symbols, but containing no spaces) naming the distinct strings in the set
a non-negative integer (p) giving the number of pairs in the relation
a sequence of 2p words, each contained in the set, specifying the pairs: w0, w1, w2, w3, ... means the relation contains the pairs (w0, w1), (w2,w3), ...
For example, this input:

3
a
b
c
4
a a
a b
b b
c c
specifies the set {a, b, c} and the relation {(a,a), (a,b), (b,b), (c,c)}. 

The program checks whether relationship is reflexive, symmetric, transitive, and antisymmetric, and prints out the results. It also prints out whether it is an equivalence relation, a partial order, both, or neither.

For example, given the above input, the output is:

reflexive
not symmetric
transitive
antisymmetric
partial order
