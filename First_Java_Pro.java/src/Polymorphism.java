/*class Polymorphism {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a , int b, int c){
        return a+ b + c;
    }

}
class TestOverloading{
    public static void main (String[] args){
        Polymorphism p1 = new Polymorphism();
        System.out.println(Polymorphism.add(11,11)); // Output: 22
        System.out.println(Polymorphism.add(11,11,11)); // Output : 33

    }
}*/
/*class Polymorphism {
    static int add(int a, int b) {
        return a + b;
    }

    static double add (double a, double b){
        return a + b;
    }
}
class TestOverloading2 {
    public static void main (String[] args) {
        System.out.println(Polymorphism.add(11,11));// Output : 22
        System.out.println(Polymorphism.add(12.3, 12.6));// Output: 24.9
    }
}*/
/*class Polymorphism {// it the error one
    static int add(int a, int b) {
        return a + b;
    }
    static double add (int a, int b) {
        return a + b;
    }
}
class TestOverloading {
    public static void main (String[] args) {
        System.out.println(Polymorphism.add(11,11));// it the Error one that cause Polymorphism don't known which one to choose
    }
}*/
class Polymorphism1 {
    int a = 90;
}
class TestOverloading extends Polymorphism1{
    int a =150;
    public static void main(String[] args) {
        Polymorphism1 p1 = new TestOverloading();
        TestOverloading t = new TestOverloading();
        System.out.println(p1.a);
        System.out.println(t.a);
    }
}



















