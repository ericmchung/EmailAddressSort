Assumptions/Limitations
-----------------------
* This program is inteneded to run on Unix/Linux.
* The input file must have .txt extension.
* Each line in the input file can only have one email address. Empty lines are allowed in the input file though.
* Each email address in the input file must be in a valid email address format. i.e. localpart@domain.


For Unix/Linux Users
---------------------
1. To compile, use the following command:

javac -d bin -sourcepath src -cp lib/spring-context.jar:lib/spring-context-support.jar:lib/spring-core.jar:lib/spring-beans.jar:lib/spring-test.jar src/com/sort/EmailAddressSort.java

2. Copy the input file to the test directory

3. To run the program with, for example, input1.txt as input file, use the following command:

java -cp bin:test:lib/spring-context.jar:lib/spring-context-support.jar:lib/spring-core.jar:lib/spring-beans.jar:lib/spring-expression.jar:lib/spring-test.jar:lib/commons-logging.jar com.sort.EmailAddressSort input1.txt

