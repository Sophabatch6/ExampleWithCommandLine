package input;

interface TestInterface
{
    // abstract method
    default void square(int a) {
        System.out.println("Happy");
    }

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}

class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void  sum(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String[] args)
    {
        TestClass d = new TestClass();
        d.sum(4);

        // default method execute
    }
}
