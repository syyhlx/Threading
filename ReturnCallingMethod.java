public class ReturnCallingMethod {

    public static void main(String[] args) {
       //System.out.println(method1());
        method1();
    }

    public static String method1() {
      // System.out.println(method2());
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
       for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }

        return  Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();

        return  Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[stackTraceElements.length-3].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[stackTraceElements.length-4].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[stackTraceElements.length-5].getMethodName();
    }
}
