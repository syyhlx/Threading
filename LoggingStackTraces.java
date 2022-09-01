
public class LoggingStackTraces {

    public static void main(String[] args) {

            log(" In method");
    }

    public static void log(String text) {
        //write your code here

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

            System.out.println(Thread.currentThread().getStackTrace()[2].getFileName() +
                    ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + "" +":" +  text);

    }
}
