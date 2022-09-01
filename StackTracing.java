public class StackTracing {


    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method4() {
        method5();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method5() {
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //System.out.println("Yes I'm printing...");
        //System.out.println(stackTraceElements[stackTraceElements.length-1]);
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
}
