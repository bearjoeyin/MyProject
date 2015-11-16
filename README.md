What does the program do?

A program that sorts and prints out its commandline arguments, treating digits as numbers. This means that anywhere two strings have the same prefix and both consist of digits the digits should be converted to numbers and compared arithmetically.

·           The sort is case sensitive (ASCII sort order).

·           The strings will be ASCII characters only.

·           No negative numbers are allowed (i.e. the ‘-‘ character is just an ordinary non-digit character).

·           The period character is treated as a character, not as a decimal place.

·           The numbers are treated as base-ten numbers.

·           The sort order is the same with all leading zeroes removed from all numbers. On the other hand, if two strings are equal, except for having different lengths (because of leading zeroes) their sort order is undefined.

·           Numbers up to 9,999,999,999 is supported.

# MyProject
1. Get the two source files Sort.java and MyComparator.java, put them into the same directory.
2. Compile the java file by running: javac Sort.java
3. Run the class file: java Sort 1 2 3
4. Output will be printed:
1
2
3
