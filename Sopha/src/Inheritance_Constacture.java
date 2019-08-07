class Inheritance_Constacture {
    Inheritance_Constacture(){
        System.out.println("Hello");
    }
}
class Inheritance_Constracture_Child extends Inheritance_Constacture{
    Inheritance_Constracture_Child(){
        System.out.println("Hi");
    }
}
class MainClass2{
    public static void main(String[] args){
         new Inheritance_Constracture_Child();

    }
}

