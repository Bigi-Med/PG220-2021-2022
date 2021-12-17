# PG220

USER GUIDE : 

How to launch the program:

Each repository with the name EtapeX has two repositorys, Algo and ReadWrite, to launch the program, we should be positionned in the EtapeX repository, the entry point of each Etape that has the main class is a file named Itest.java  

to Compile : javac */*.java
to Run : java Algo/Itest

Etape 1:
In Etape 1, the program reads the XML files, of clients and suppliers, then it prints them out, and prints out wether their attributs are valid or not.

Etape 2:
In Etape 2, we generate decoupes.xml and the corresponding svg files, when the program is launched(Itest), a graphical interface pops up, containing containing a button, when pressed generates the svg files, Panels are brown and Planks are blue. 

Etape 3:

In Etape 3: we generate decoupes.xml and the corresponding svg files, depending on the algorithm (1 or 2), to choose wich algorithm to use,
to navigate between the algorithm, the call for them is made between lines 171 and 179 in (Itest.java) . One of the algorithms is already commented, so the choos one of them, we can just uncomment it and comment the other one.
Upon generating the svg files, a number of files called log_X.txt, equal to the number of svg, ie Panels user, these files contains different information on algorithm efficiency, printing out the totale surface of the Panel, the surface used, the surface left, the percentage used as well as the percentage wasted, we can thus compare the performance of both algorithms.

**********
Our svg files are generated by generating the decoupes.xml files, the reading them and creating svg files accordingly
**********

**********
In Etape 2: after pressing the button, we need to exit the pop up window in order to finish the program execution

