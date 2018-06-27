For Unix/Linux Users
---------------------
To compile, use the following command:

javac -d bin -sourcepath src -cp lib/spring-context.jar:lib/spring-context-support.jar:lib/spring-core.jar:lib/spring-beans.jar:lib/spring-test.jar src/com/sort/EmailAddressSort.java

Before running the program, the input file must have .txt extension and it has to be in the test directory

For example, to run the program with input1.txt as input file, use the following command:

java -cp bin:test:lib/spring-context.jar:lib/spring-context-support.jar:lib/spring-core.jar:lib/spring-beans.jar:lib/spring-expression.jar:lib/spring-test.jar:lib/commons-logging.jar com.sort.EmailAddressSort input1.txt

