public class StaticInnerExample {
    int num = 7;
    static int staticNum = 11;

    static class NestedClass {
        public void testMethod() {
            System.out.println("Inside test method of the static nested class");
            //           System.out.println(num);  not allowed because nested class cannot access the instance variables of outer class
            System.out.println(staticNum);
        }

    }

    class InnerClass {
        public void testMethod() {
            System.out.println("Inside test method of the nested class");
            System.out.println(num);
            System.out.println(staticNum);
        }
    }

    public static void main(String[] args) {
        StaticInnerExample sNE = new StaticInnerExample();
        NestedClass sNC = new NestedClass();
        sNC.testMethod();
        InnerClass nSNC = sNE.new InnerClass();
        nSNC.testMethod();


    }
}
