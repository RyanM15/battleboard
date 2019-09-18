# battleboard
Exploration of simple Arrays in Java

As a continuation of the units in Java - beyond simple primitive data types and String manipulation, it's time to think a little deeper about how we can manipulate, access, store data in Java.

Think of the example of a teacher with a class of 20 students, creating a simple roster.
For each student in the class, the may have multiple pieces of information associated with them, but lets just think of a list of names for now.

If we were to create a String variable for each student, i.e. String name1 = "Lucy"; etc - it might be a challenge to print the roster each time, by listing out each variable that corresponds to each student.  Perhaps there is a better way to store similar data without all the variables or 'buckets' of information.

*Enter the Array*

An array in java works like a list or other grouping of data that allows you to store groups of similar information, under one name, and reference each *element* using an index.

Arrays are identified by the square brackets following the name of the array, and must be typed.
For example:  an array may up of Strings may be *DECLARED* as follows:

String[ ] names

However - Java demands that an array must be also initialized with a capacity when first created, so

String[ ] names = new String[ 30 ];

where
