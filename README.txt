javac -d bin -sourcepath src -cp lib/spring-context.jar:lib/spring-context-support.jar:lib/spring-core.jar:lib/spring-beans.jar:lib/spring-test.jar src/com/sort/EmailAddressSort.java

java -cp bin:test:lib/spring-context.jar:lib/spring-context-support.jar:lib/spring-core.jar:lib/spring-beans.jar:lib/spring-expression.jar:lib/spring-test.jar:lib/commons-logging.jar com.sort.EmailAddressSort

