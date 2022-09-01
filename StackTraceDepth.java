
public class StackTraceDepth {

    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println(deep);
        //int stackTraceLength = method1().length - method3().length + 1;
    }

    public static int getStackTraceDepth() {
        //write your code here
        int depth = 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
            depth++;
        }
        return  depth;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();
    }

    public static StackTraceElement[] method3() {
        return null;
    }
}
