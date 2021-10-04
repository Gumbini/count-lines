# Count Lines
A simple Java program that can count the lines / rows of code in a file or directory.


Building
--------

Simply call the java compiler:

    javac Counter.java


Usage
-----

Drag the compiled file into a directory and execute it.

    java Counter "./subdirectory"
    java Counter "./HelloWorld.java"
    java Counter "."
    ...


**Please keep in mind that when you specify "." as the argument that the program counts itself!**


When using the precompiled JAR at https://github.com/gumbini/count-lines/releases:
  
    java -jar CountLines.jar "./subdirectory"
    ...

Sample Output
-------------

    $ java -jar CountLines.jar "./src/"
    Counter.java: 51 lines
    MANIFEST.MF: 3 lines
    
    All files (2): 54 lines
