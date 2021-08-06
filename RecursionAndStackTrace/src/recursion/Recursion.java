package recursion;

public class Recursion {

    public static void main(String[] args) {

        // easycounter();
        RecursiveCounter(0);
        //   printStackTrace();
    }

    public static void easycounter() { // prints all nums from 0 to 9

        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }

    }

    public static void RecursiveCounter(int a) {  // prints all nums from 0 to 9

        if (a != 10) {
            System.out.println(a);
             printStackTrace();
            RecursiveCounter(a + 1);
           
        }

    }

    public static void printStackTrace() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println("Printing stack trace, current length: " + elements.length);
        for (int i = 0; i < elements.length; i++) {
            StackTraceElement s = elements[i];
            System.out.println("\t at "
                    + s.getClassName() + "."
                    + s.getMethodName()
                    + "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
        }
        System.out.println("\n");
    }

}
