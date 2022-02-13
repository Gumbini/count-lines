# Count Lines

A ***very*** simple Java program that can count the rows / lines of code in a file or directory including subdirectories.

## Build

Call the Java compiler manually. It's just one file...

```
javac Counter.java
```

## Usage

Drag the [compiled file](https://github.com/Gumbini/count-lines/releases) into a directory and execute it.

```
java Counter "./subdirectory"
java Counter "./HelloWorld.java"
java Counter "."
...
```

**Please note that when specifying "." as the path argument that the program counts itself!**

## Sample Output

```
$ java Counter "./src/"
Counter.java: 51 lines
MANIFEST.MF: 3 lines

All files (2): 54 lines
```
